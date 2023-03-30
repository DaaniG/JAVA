package VariablesYTiposDeDatos;

/**
 * Variables y tipos de datos: Operadores lógicos
 * @author TitoDev
 */

public class OperadoresLogicos {

    public static void main(String[] args) {

        /* Operador lógico AND: se utiliza para comprobar si ambas expresiones son verdaderas o falsas.
        Este operador se representa por dos símbolos de ampersand "&&". */
        int numero = 10;
        boolean esMayorQueCeroYMenorQueVeinte = numero > 0 && numero < 20; // devuelve true

        boolean esVerdadero = true;
        boolean esFalso = false;
        boolean sonAmbosVerdaderos = esVerdadero && esFalso; // devuelve false

        /* Operador lógico OR: se utiliza para comprobar si al menos una de las expresiones es verdadera.
        Este operador se representa por dos símbolos de barra vertical "||". */
        int numOR = 10;
        boolean esMenorQueCeroOEsMayorQueVeinte = numOR < 0 || numOR > 20; // devuelve false

        boolean esVer = true;
        boolean esFal = false;
        boolean esCualquierCosaVerdadera = esVer || esFal; // devuelve true

        /* Operador lógico NOT: se utiliza para negar una expresión.
        Este operador se representa por el símbolo de exclamación "!". */
        boolean esVerNOT= true;
        boolean esFalNOT = !esVerNOT; // devuelve false

        int numNOT = 10;
        boolean noEsMenorQueCero = !(numNOT < 0); // devuelve true
    }
}
