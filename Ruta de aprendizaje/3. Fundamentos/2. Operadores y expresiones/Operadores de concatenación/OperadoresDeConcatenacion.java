package VariablesYTiposDeDatos;

import java.util.Date;

/**
 * Variables y tipos de datos: Operadores de comparación
 * @author TitoDev
 */

public class OperadoresDeConcatenacion {

    public static void main(String[] args) {

        /* Concatenación (+): El operador de concatenación se utiliza para combinar dos cadenas de caracteres. */
        String cadena1 = "Hola ";
        String cadena2 = "Mundo";
        String resultado = cadena1 + cadena2; // El valor de resultado será "Hola Mundo"

        /* Concatenación con valor numérico: El operador de concatenación también se puede utilizar para combinar una
        cadena y un valor numérico. En este caso, el valor numérico se convierte automáticamente en una cadena antes
        de concatenarse. */
        int x = 5;
        String cadenaNum = "El valor de x es: " + x; // El valor de cadenaNum será "El valor de x es: 5"

        /* Concatenación con objetos: El operador de concatenación también se puede utilizar para combinar una cadena
        y otro objeto. En este caso, el objeto se convierte automáticamente en una cadena antes de concatenarse. */
        Date fecha = new Date();
        String cadenaObj = "La fecha actual es: " + fecha; // El valor de cadenaObj será "La fecha actual es: Mon Mar 29 17:31:00 UTC 2023"

    }
}
