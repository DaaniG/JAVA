package EstructurasDeControl;

import java.util.ArrayList;

/**
 * Estructuras de control. ForEach
 * @author TitoDev
 */

public class ForEach {

    public static void main(String[] args) {
        // Crear una lista de números enteros
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Iterar sobre la lista utilizando la estructura foreach
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
