import controller.ChatController;
import model.ChatModel;
import view.ChatView;

/**
 * Chat MVC - Main
 * Esta clase es la clase principal de la aplicación del patrón de diseño MVC para una aplicación de chat.
 * Crea instancias del modelo, vista y controlador y muestra la ventana principal.
 * @version 1.0
 */

public class Main {

    /**
     * El método principal de la aplicación. Crea las instancias del modelo, vista y controlador y muestra la ventana principal.
     * @param args Los argumentos de línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        // Crear las instancias de Model, View y Controller
        ChatModel model = new ChatModel(""); // La ruta del archivo de mensajes.
        ChatView view = new ChatView(); // La vista del chat.
        ChatController controller = new ChatController(model, view); // El controlador del chat.

        view.show(); // Muestra la vista del chat.
        controller.start(); // Inicia el controlador del chat.
    }
}