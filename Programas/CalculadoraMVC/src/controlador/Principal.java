/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Principal extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Calculadora MVC");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Principal.class.getResource("/vista/CalculadoraView.fxml"));
        Pane ventana = (Pane) loader.load();
        Scene scene = new Scene(ventana);
        stage.setScene(scene);
        stage.show();
    }
}
