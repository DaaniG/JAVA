package Sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Java Avanzado. Sockets
 * @author TitoDev
 */

public class EjemploSockets {
    
    public static void main(String[] args) {

        // Crea un socket de servidor en el puerto 8080 y espera a que un cliente se conecte
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket clientSocket = serverSocket.accept();
            // Se estableció la conexión con el cliente, se puede utilizar el objeto Socket para enviar y recibir datos
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Crea un socket de cliente que se conecta al servidor con la dirección IP "localhost" y el puerto 8080
        try {
            Socket socket = new Socket("localhost", 8080);
            // Se estableció la conexión con el servidor, se puede utilizar el objeto Socket para enviar y recibir datos
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Envía la cadena "Hola, servidor" al servidor a través del objeto Socket
        try {
            Socket socket = new Socket("localhost", 8080);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hola, servidor!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
