package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Chat MVC - View
 * La vista de la aplicación Chat MVC.
 * @author TitoDev
 * @version 1.0
 */
public class ChatView extends JFrame {

    private final JTextArea chatArea;
    private final JTextField messageField;
    private final JButton sendButton;

    /**
     * Crea una nueva instancia de la vista.
     */
    public ChatView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chat MVC");

        // Área del chat
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setPreferredSize(new Dimension(600, 400));
        add(scrollPane, BorderLayout.CENTER);

        // Entrada de texto
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        messageField = new JTextField();
        messageField.setFont(new Font("Arial", Font.PLAIN, 16));
        sendButton = new JButton("Send");
        sendButton.setFont(new Font("Arial", Font.BOLD, 16));
        sendButton.setBackground(new Color(0, 150, 136));
        sendButton.setForeground(Color.WHITE);
        inputPanel.add(messageField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Obtiene el mensaje introducido por el usuario.
     * @return el mensaje introducido por el usuario.
     */
    public String getMessage() {
        return messageField.getText();
    }

    /**
     * Establece el mensaje a mostrar en la entrada de texto.
     * @param message el mensaje a mostrar.
     */
    public void setMessage(String message) {
        messageField.setText(message);
    }

    /**
     * Añade un mensaje al área de chat.
     * @param message el mensaje a añadir.
     */
    public void appendMessage(String message) {
        chatArea.append(message + "\n");
    }

    /**
     * Añade un ActionListener al botón "Send".
     * @param listener el ActionListener a añadir.
     */
    public void addSendButtonListener(ActionListener listener) {
        sendButton.addActionListener(listener);
    }

    /**
     * Muestra una lista de mensajes en el área de chat.
     * @param messages la lista de mensajes a mostrar.
     */
    public void displayMessages(List<String> messages) {
        for (String message : messages) {
            appendMessage(message);
        }
    }
}
