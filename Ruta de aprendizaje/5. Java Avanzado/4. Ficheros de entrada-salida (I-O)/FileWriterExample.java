package EntradaYSalida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Java Avanzado. Entrada y salida
 * @author TitoDev
 */

public class FileWriterExample {

    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = "Hola, mundo!";
            bufferedWriter.write(line);

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
