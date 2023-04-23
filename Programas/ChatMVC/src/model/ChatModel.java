package model;

import java.io.*;
import java.util.*;

/**
 * Chat MVC - Model
 * Esta es la clase modelo del patrón de diseño MVC para una aplicación de chat.
 * Contiene una lista de mensajes y los métodos necesarios para agregar y cargar mensajes desde / hacia un archivo.
 * @author TitoDev
 * @version 1.0
 */

public class ChatModel {
    private final String fileName; // El nombre del archivo donde se almacenarán los mensajes.
    private final List<String> messages; // La lista de mensajes.

    /**
     * Constructor de la clase ChatModel.
     * @param fileName El nombre del archivo donde se almacenarán los mensajes.
     */
    public ChatModel(String fileName) {
        this.fileName = fileName;
        messages = new ArrayList<>();
    }

    /**
     * Agrega un mensaje a la lista de mensajes y lo guarda en el archivo.
     * @param message El mensaje a agregar.
     */
    public void addMessage(String message) {
        messages.add(message);
        saveMessagesToFile();
    }

    /**
     * Obtiene la lista de mensajes.
     * @return La lista de mensajes.
     */
    public List<String> getMessages() {
        return messages;
    }

    /**
     * Guarda la lista de mensajes en el archivo especificado.
     */
    private void saveMessagesToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String message : messages) {
                writer.write(message);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga la lista de mensajes desde el archivo especificado.
     */
    public void loadMessagesFromFile() {
        messages.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                messages.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
