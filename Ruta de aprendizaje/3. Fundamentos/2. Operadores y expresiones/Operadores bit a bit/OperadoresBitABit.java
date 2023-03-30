package VariablesYTiposDeDatos;

/**
 * Variables y tipos de datos: Operadores bit a bit
 * @author TitoDev
 */

public class OperadoresBitABit {

    public static void main(String[] args) {

        /* AND a nivel de bits (&): realiza una operación AND a nivel de bits en dos valores enteros y devuelve un
        nuevo valor entero. */
        int resAND = 6 & 3; // resultado será igual a 2 (en binario: 110 & 011 = 010)

        /* OR a nivel de bits (|): realiza una operación OR a nivel de bits en dos valores enteros y devuelve un nuevo
        valor entero. */
        int resOR = 6 | 3; // resultado será igual a 7 (en binario: 110 | 011 = 111)

        /* XOR a nivel de bits (^): realiza una operación XOR a nivel de bits en dos valores enteros y devuelve un
        nuevo valor entero. */
        int resXOR = 6 ^ 3; // resultado será igual a 5 (en binario: 110 ^ 011 = 101)

        /* Complemento a uno (~): realiza una operación de complemento a uno en un valor entero y devuelve un nuevo
        valor entero. */
        int resCompUno = ~6; // resultado será igual a -7 (en binario: ~110 = -111)

        /* Desplazamiento a la izquierda (<<): realiza una operación de desplazamiento a la izquierda en un valor
        entero y devuelve un nuevo valor entero. El valor se desplaza a la izquierda la cantidad especificada de bits,
        y se rellena con ceros a la derecha. */
        int resDespIzq = 6 << 2; // resultado será igual a 24 (en binario: 110 << 2 = 11000)

        /* Desplazamiento a la derecha con signo (>>): realiza una operación de desplazamiento a la derecha en un
        valor entero y devuelve un nuevo valor entero. El valor se desplaza a la derecha la cantidad especificada de
        bits, y se rellena con el bit de signo a la izquierda (es decir, se extiende el signo). */
        int resDespDchSig = -6 >> 2; // resultado será igual a -2 (en binario: 11111111111111111111111111111010 >> 2 = 11111111111111111111111111111110)

        /* Desplazamiento a la derecha sin signo (>>>): realiza una operación de desplazamiento a la derecha sin signo
        en un valor entero y devuelve un nuevo valor entero. El valor se desplaza a la derecha la cantidad especificada
        de bits, y se rellena con ceros a la izquierda. */
        int resDespDch = -6 >>> 2; // resultado será igual a 1073741822 (en binario: 11111111111111111111111111111010 >>> 2 = 00111111111111111111111111111110)
    }
}
