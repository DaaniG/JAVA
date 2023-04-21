package EntradaYSalida;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java Avanzado. Entrada y salida
 * @author TitoDev
 */

public class FileReaderExample {

    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            System.out.println(line);

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
