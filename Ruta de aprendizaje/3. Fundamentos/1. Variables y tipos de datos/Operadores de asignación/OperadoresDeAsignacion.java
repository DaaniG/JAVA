package VariablesYTiposDeDatos;

/**
 * Variables y tipos de datos: Operadores de asignación
 * @author TitoDev
 */

public class OperadoresDeAsignacion {

    public static void main(String[] args) {

        /* Asignación simple (=): asigna un valor a una variable. */
        int x = 10; // asigna el valor 10 a la variable x

        /* Asignación compuesta (+=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=): combina un operador aritmético, bit
        a bit o de comparación con el operador de asignación simple. Primero se realiza la operación indicada y luego
        se asigna el resultado a la variable.*/
        int y = 5;
        y += 3; // equivale a x = x + 3, asigna el valor 8 a la variable x
        y *= 2; // equivale a x = x * 2, asigna el valor 16 a la variable x
    }
}
