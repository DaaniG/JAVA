/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 * Calculadora Model Class
 * 
 * @author TitoDev
 */
public class CalculadoraModel {
    
    // Atributos
    private boolean digito = false;
    private boolean punto = false;
    private int numOperandos = 0;
    private double operando1, operando2;
    private char operador = ' ';
    

    // Función que devuelve un string y la envía a la pantalla
    public String digitoPantalla(String numero, String output) {
        if(!digito && numero.equals("0")) {
            return output;
        }
        
        if(!digito) {
            output = "";
            punto = false;
        }
        
        String valActual = output;
        output = valActual + numero;
        digito = true;
        return output;
    }
    
    // Función que comprueba qué operación estamos haciendo
    public String evaluarOperador(String op, String output) {
        if(digito) {
            numOperandos++;
        }
        
        if(numOperandos == 1) {
            operando1 = Double.parseDouble(output);
        }
        
        if(numOperandos == 2) {
            operando2 = Double.parseDouble(output);
            
            switch(operador){
                case '+' : 
                    operando1 += operando2;
                    break;
                case '-' :
                    operando1 -= operando2;
                    break;
                case '*' :
                    operando1 *= operando2;
                    break;
                case '/' :
                    operando1 /= operando2;
                    break;
                case '=' : 
                    operando1 = operando2;
                    break;
            }
            
            if(operando1 % 1 == 0) {
                output = String.valueOf((int) operando1);
            } else {
                output = String.valueOf(operando1);
            }
            
            numOperandos = 1;
            punto = false;
        }
        digito = false;
        operador = op.charAt(0);
        return output;
    }
    
    // Función que añade la coma a nuestro número.
    public String getComa(String output) {
        if(!punto && !digito) {
            output = "0.";
            digito = true;
        } else if(!punto) {
            String valActual = output;
            output = valActual + ".";
        }
        
        punto = true;
        return output;
    }
    
    // Función que borra el último dígito de nuestro número.
    public String borrar(String output) {
        if(output.length() == 1) {
            digito = false;
            return "0";
        }
        
        if(!output.substring(0, output.length() - 1).contains(".")) {
            punto = false;
        }
        
        return output.substring(0, output.length() - 1);
    }
    
    // Función que borra nuestro número.
    public String borrarTodo(String output) {
        digito = false;
        output = "0";
        return output;
    }
}
