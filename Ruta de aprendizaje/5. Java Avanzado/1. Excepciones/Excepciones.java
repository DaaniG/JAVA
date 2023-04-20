package Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java Avanzado. Excepciones
 * @author TitoDev
 */

public class Excepciones {

    public static void main(String[] args) {

        // Cheched exceptions
        try {
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        // Unchequed exceptions
        String s = null;
        System.out.println(s.length()); // Lanza una NullPointerException

        // Errors
        int[] array = new int[Integer.MAX_VALUE]; // Lanza una OutOfMemoryError
    }
}
