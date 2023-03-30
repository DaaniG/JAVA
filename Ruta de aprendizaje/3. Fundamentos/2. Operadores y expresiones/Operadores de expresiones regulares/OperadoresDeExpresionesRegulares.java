package VariablesYTiposDeDatos;

/**
 * Variables y tipos de datos: Operadores de expresiones regulares
 * @author TitoDev
 */

public class OperadoresDeExpresionesRegulares {

    public static void main(String[] args) {

        /* . (punto): El operador de punto se utiliza para buscar cualquier carácter, excepto el carácter de nueva
        línea (\n). */
        String cadena = "Hola Mundo";
        boolean resultado = cadena.matches("H..a"); // El valor de resultado será true

        /* [] (corchetes): Los corchetes se utilizan para buscar un conjunto de caracteres. */
        String cadenaCor = "Hola Mundo";
        boolean resCor = cadena.matches("[Hh]ola [Mm]undo"); // El valor de resCor será true

        /* ^ (circunflejo): El operador de circunflejo se utiliza para buscar una cadena que comience con un cierto patrón. */
        String cadenaCir = "Hola Mundo";
        boolean resCir = cadena.matches("^H[a-z]*"); // El valor de resCir será true

        /* $ (signo de dólar): El operador de signo de dólar se utiliza para buscar una cadena que termine con un
        cierto patrón. */
        String cadenaDol = "Hola Mundo";
        boolean resDol = cadena.matches(".*do$"); // El valor de resDol será true

        /* | (barra vertical): El operador de barra vertical se utiliza para buscar cualquiera de los patrones
        especificados. */
        String cadenaBar = "Hola Mundo";
        boolean resBar = cadena.matches("Hola|Adiós"); // El valor de resBar será true si la cadena es "Hola" o "Adiós"

        /* () (paréntesis): Los paréntesis se utilizan para agrupar patrones juntos. */
        String cadenaPar = "Hola Mundo";
        boolean resPar = cadena.matches("(Hola|Adiós) Mundo"); // El valor de resPar será true si la cadena es "Hola Mundo" o "Adiós Mundo"
    }
}
