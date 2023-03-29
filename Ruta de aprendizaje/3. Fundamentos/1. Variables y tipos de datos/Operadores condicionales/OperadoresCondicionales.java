package VariablesYTiposDeDatos;

/**
 * Variables y tipos de datos: Operadores condicionales
 * @author TitoDev
 */

public class OperadoresCondicionales {

    public static void main(String[] args) {

        /* AND lógico (&&): devuelve verdadero si y solo si ambas expresiones booleanas son verdaderas. Si la primera
        expresión es falsa, no se evalúa la segunda expresión. */
        boolean resAND = (4 < 5) && (3 > 1); // resAND será verdadero (ambas expresiones son verdaderas)

        /* OR lógico (||): devuelve verdadero si al menos una de las expresiones booleanas es verdadera. Si la primera
        expresión es verdadera, no se evalúa la segunda expresión. */
        boolean resOR = (4 > 5) || (3 < 1); // resOR será verdadero (la segunda expresión es verdadera)

        /* NOT lógico (!): invierte el valor booleano de una expresión. */
        boolean resNOT = !(4 < 5); // resNOT será falso (la expresión es verdadera, pero se invierte con el operador !)
    }
}
