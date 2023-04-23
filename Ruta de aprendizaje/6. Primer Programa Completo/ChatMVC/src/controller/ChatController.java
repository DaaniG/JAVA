package controller;

import model.ChatModel;
import view.ChatView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Chat MVC - Controller
 * Controlador del chat, se encarga de manejar la lógica del programa y
 * la interacción entre la vista y el modelo.
 * @author TitoDev
 * @version 1.0
 */

public class ChatController implements ActionListener {
    private final ChatModel model;
    private final ChatView view;

    private List<Socket> connectedClients; // Inicializar lista de clientes conectados

    /**
     * Constructor del controlador del chat.
     *
     * @param model Modelo del chat
     * @param view  Vista del chat
     */
    public ChatController(ChatModel model, ChatView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Inicia el programa.
     */
    public void start() {
        // Cargar los mensajes desde el archivo al inicio
        model.loadMessagesFromFile();

        // Mostrar los mensajes en la vista
        List<String> messages = model.getMessages();
        view.displayMessages(messages);

        // Agregar el controlador como listener del botón "Send"
        view.addSendButtonListener(this);

        // Iniciar el servidor
        startServer();

        // Inicializar lista de clientes conectados
        connectedClients = new ArrayList<>();
    }

    /**
     * Maneja el evento del botón "Send".
     * @param e Evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String message = view.getMessage();
        model.addMessage(message);
        view.setMessage("");

        // Enviar el mensaje a todos los clientes
        sendToClients(message);
        view.appendMessage(message);
    }

    /**
     * Inicia el servidor.
     */
    private void startServer() {
        new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(8080)) {
                while (true) {
                    Socket clientSocket = serverSocket.accept();

                    // Crear un nuevo hilo para manejar la conexión con el cliente
                    new Thread(() -> {
                        try {
                            // Obtener los mensajes desde el archivo
                            List<String> messages = model.getMessages();

                            // Enviar los mensajes al cliente
                            sendToClient(clientSocket, messages);

                            // Agregar el cliente a la lista de clientes conectados
                            addClient(clientSocket);

                            // Escuchar los mensajes del cliente
                            listenToClient(clientSocket);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    /**
     * Envía un mensaje a todos los clientes conectados.
     * @param message Mensaje a enviar
     */
    private void sendToClients(String message) {
        for (Socket clientSocket : connectedClients) {
            try {
                clientSocket.getOutputStream().write(message.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Envía los mensajes al cliente.
     * @param clientSocket Socket del cliente
     * @param messages     Lista de mensajes a enviar
     * @throws IOException Si hay un error al enviar los mensajes
     */
    private void sendToClient(Socket clientSocket, List<String> messages) throws IOException {
        for (String message : messages) {
            clientSocket.getOutputStream().write(message.getBytes());
        }
    }

    /**
     Escucha los mensajes enviados por un cliente.
     @param clientSocket el socket del cliente
     @throws IOException si ocurre un error de entrada/salida durante la comunicación con el cliente
     */
    private void listenToClient(Socket clientSocket) throws IOException {
        new Thread(() -> {
            try {
                while (true) {
                    byte[] buffer = new byte[1024];
                    int bytesRead = clientSocket.getInputStream().read(buffer);

                    if (bytesRead == -1) {
                        // El cliente se ha desconectado
                        removeClient(clientSocket);
                        break;
                    }

                    String message = new String(buffer, 0, bytesRead);
                    model.addMessage(message);
                    view.appendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    /**
     Agrega un nuevo cliente a la lista de clientes conectados.
     @param clientSocket el socket del cliente a agregar
     */
    private void addClient(Socket clientSocket) {
        connectedClients.add(clientSocket);
    }

    /**

     Elimina un cliente de la lista de clientes conectados.
     @param clientSocket el socket del cliente a eliminar
     */
    private void removeClient(Socket clientSocket) {
        connectedClients.remove(clientSocket);
    }
}