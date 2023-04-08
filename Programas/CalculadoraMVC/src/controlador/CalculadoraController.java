/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import modelo.CalculadoraModel;

/**
 * Calculadora Controller class
 *
 * @author TitoDev
 */
public class CalculadoraController implements Initializable {
    
    // Model
    private CalculadoraModel model = new CalculadoraModel();

    // Pantalla
    @FXML
    private Label output;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        output.setText("0");
    }    

    // Operaciones
    @FXML
    private void clickRestar(ActionEvent event) {
        output.setText(model.evaluarOperador("-", output.getText()));
    }

    @FXML
    private void clickSumar(ActionEvent event) {
        output.setText(model.evaluarOperador("+", output.getText()));
    }
    
    @FXML
    private void clickDividir(ActionEvent event) {
        output.setText(model.evaluarOperador("/", output.getText()));
    }

    @FXML
    private void clickMultiplicar(ActionEvent event) {
        output.setText(model.evaluarOperador("*", output.getText()));
    }

    // Teclas específicas
    @FXML
    private void clickBorrar(ActionEvent event) {
        output.setText(model.borrar(output.getText()));
    }
    
    @FXML
    private void clickComa(ActionEvent event) {
        output.setText(model.getComa(output.getText()));
    }
    
    @FXML
    private void clickIgual(ActionEvent event) {
        output.setText(model.evaluarOperador("=", output.getText()));
    }

    @FXML
    private void clickAC(ActionEvent event) {
        output.setText(model.borrarTodo(output.getText()));
    }

    @FXML
    private void clickOff(ActionEvent event) {
        System.exit(0);
    }

    // Teclas numéricas
    @FXML
    private void clickCero(ActionEvent event) {
        output.setText(model.digitoPantalla("0", output.getText()));
    }
    
    @FXML
    private void clickUno(ActionEvent event) {
        output.setText(model.digitoPantalla("1", output.getText()));
    }

    @FXML
    private void clickDos(ActionEvent event) {
        output.setText(model.digitoPantalla("2", output.getText()));
    }

    @FXML
    private void clickTres(ActionEvent event) {
        output.setText(model.digitoPantalla("3", output.getText()));
    }

    @FXML
    private void clickCuatro(ActionEvent event) {
        output.setText(model.digitoPantalla("4", output.getText()));
    }

    @FXML
    private void clickCinco(ActionEvent event) {
        output.setText(model.digitoPantalla("5", output.getText()));
    }

    @FXML
    private void clickSeis(ActionEvent event) {
        output.setText(model.digitoPantalla("6", output.getText()));
    }

    @FXML
    private void clickSiete(ActionEvent event) {
        output.setText(model.digitoPantalla("7", output.getText()));
    }

    @FXML
    private void clickOcho(ActionEvent event) {
        output.setText(model.digitoPantalla("8", output.getText()));
    }

    @FXML
    private void clickNueve(ActionEvent event) {
        output.setText(model.digitoPantalla("9", output.getText()));
    }
}
