![io](https://user-images.githubusercontent.com/75398496/233704450-33afc495-0ad7-4c1a-a3c3-05d3df8295cd.png)

# Ficheros de entrada-salida (I-O) en Java
En Java, los ficheros de entrada y salida son una forma fundamental de trabajar con datos. La entrada de datos se refiere a la lectura de información de un archivo, mientras que la salida de datos se refiere a la escritura de información en un archivo.

Para leer datos de un archivo, primero debemos crear un objeto de tipo File que represente el archivo que queremos leer. A continuación, podemos utilizar este objeto para crear un objeto de tipo FileReader, que es capaz de leer los datos del archivo. Una vez que tenemos el objeto FileReader, podemos envolverlo en un objeto de tipo BufferedReader para leer los datos de manera más eficiente.

Aquí hay un ejemplo de cómo leer una línea de texto de un archivo utilizando estas clases:

```java
import java.io.*;

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
```

Para escribir datos en un archivo, primero debemos crear un objeto de tipo File que represente el archivo en el que queremos escribir. A continuación, podemos utilizar este objeto para crear un objeto de tipo FileWriter, que es capaz de escribir datos en el archivo. Una vez que tenemos el objeto FileWriter, podemos envolverlo en un objeto de tipo BufferedWriter para escribir los datos de manera más eficiente.

Aquí hay un ejemplo de cómo escribir una línea de texto en un archivo utilizando estas clases:

```java
import java.io.*;

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
```

Es importante tener en cuenta que es necesario cerrar los objetos BufferedReader, FileReader, BufferedWriter y FileWriter una vez que hemos terminado de leer o escribir en un archivo. Esto se hace para liberar los recursos del sistema que se han utilizado para trabajar con el archivo.
