![excepciones](https://user-images.githubusercontent.com/75398496/233446860-7d4b276d-c812-47c8-ab6c-915a5cca5f43.png)

# Excepciones en Java
Las excepciones en Java son una forma de manejar situaciones excepcionales o errores que pueden ocurrir durante la ejecución de un programa. Cuando ocurre una excepción, el programa lanza un objeto de tipo Exception (o una subclase de Exception) que contiene información sobre el error y la ubicación en el código donde ocurrió el error.

Las excepciones se dividen en tres categorías en Java:

### Checked exceptions: 
Estas excepciones se verifican en tiempo de compilación, lo que significa que el compilador requiere que el programador las maneje. Las excepciones de este tipo son aquellas que pueden ocurrir durante la ejecución del programa y son predecibles, como la apertura de archivos o la conexión a bases de datos. El programador debe manejar estas excepciones utilizando un bloque try-catch o declarando la excepción en la firma del método. Ejemplos de excepciones verificadas son IOException, SQLException y ClassNotFoundException.

```java
try {
    FileReader fileReader = new FileReader("file.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = bufferedReader.readLine();
} catch (IOException e) {
    System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
}
```

### Unchecked exceptions: 
También conocidas como excepciones de tiempo de ejecución, estas excepciones no se verifican en tiempo de compilación y pueden ocurrir en cualquier momento durante la ejecución del programa. Ejemplos de excepciones no verificadas son NullPointerException, ArrayIndexOutOfBoundsException y ClassCastException. No se requiere que el programador maneje estas excepciones, pero es buena práctica hacerlo para que el programa no termine abruptamente en caso de que ocurran.

```java
String s = null;
System.out.println(s.length()); // Lanza una NullPointerException
```

### Errors: 
Los errores son excepciones que ocurren cuando el sistema o la máquina virtual de Java encuentran un problema grave que impide que el programa se ejecute normalmente. Ejemplos de errores son OutOfMemoryError, StackOverflowError y NoClassDefFoundError. Los errores no se deben manejar en el código del programa, sino que deben ser abordados a nivel del sistema.
```java
int[] array = new int[Integer.MAX_VALUE]; // Lanza una OutOfMemoryError
```
