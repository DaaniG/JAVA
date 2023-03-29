package VariablesYTiposDeDatos;

/**
 * Variables y tipos de datos: Operadores de instancia y tipo
 * @author TitoDev
 */

public class OperadoresDeInstanciaYTipo {

    public static void main(String[] args) {

        /* Operador de instancia: se utiliza para comprobar si un objeto es una instancia de una clase en
        particular. Este operador se representa por la palabra reservada "instanceof". */
        String cadena = "Hola Mundo";
        boolean esCadena = cadena instanceof String; // devuelve true

        Integer entero = new Integer(10);
        boolean esEntero = entero instanceof Integer; // devuelve true

        Double doble = new Double(3.1416);
        boolean esDoble = doble instanceof Integer; // Inconvertible types: devuelve false

        /* Operador de tipo: se utiliza para comprobar si un objeto es de un tipo de dato en particular.
        Este operador se representa por la palabra reservada "typeof".*/
        String cadenaType = "Hola Mundo";
        System.out.println(typeof(cadenaType)); // muestra "java.lang.String"

        int numero = 10;
        System.out.println(typeof(numero)); // muestra "int"

        double decimal = 3.1416;
        System.out.println(typeof(decimal)); // muestra "double"
    }
}
