![javaavanzado](https://user-images.githubusercontent.com/75398496/233447845-a3b83fac-922a-42b8-aa7b-eda52be606ae.png)

# Java avanzado
Es un conjunto de técnicas y herramientas que permiten desarrollar aplicaciones más robustas, escalables y eficientes. A continuación, describiré brevemente algunos de los conceptos y características más relevantes del Java avanzado, junto con un ejemplo práctico para cada uno de ellos:

## Excepciones: 
Las excepciones son una herramienta fundamental en Java para manejar errores y situaciones excepcionales que pueden ocurrir durante la ejecución de una aplicación. Un ejemplo de excepción sería intentar abrir un archivo que no existe. La forma de manejar las excepciones es a través del uso de bloques try-catch, donde el bloque try contiene el código que podría lanzar una excepción y el bloque catch se encarga de manejar la excepción en caso de que ocurra.

Ejemplo:

```java
try {
    FileReader fileReader = new FileReader("file.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = bufferedReader.readLine();
} catch (IOException e) {
    System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
}
```

## Threads:
Los threads o hilos son una forma de ejecutar varias tareas de forma simultánea en una misma aplicación. Java proporciona una interfaz de programación de aplicaciones (API) para trabajar con threads. Los threads pueden ser utilizados para mejorar el rendimiento de una aplicación, permitiendo que varias tareas se ejecuten en paralelo.

Ejemplo:

```java
public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
```

## Sockets y comunicación en red: 
Java proporciona una API para trabajar con sockets y permitir la comunicación entre diferentes aplicaciones en una red. Los sockets se utilizan para establecer conexiones entre diferentes dispositivos, como un servidor y un cliente, y para intercambiar datos entre ellos.

Ejemplo:

```java
// Servidor
try {
    ServerSocket serverSocket = new ServerSocket(1234);
    Socket socket = serverSocket.accept();
    DataInputStream in = new DataInputStream(socket.getInputStream());
    String message = in.readUTF();
    System.out.println("Mensaje recibido: " + message);
    socket.close();
} catch (IOException e) {
    e.printStackTrace();
}

// Cliente
try {
    Socket socket = new Socket("localhost", 1234);
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    out.writeUTF("Hola, soy el cliente");
    socket.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Ficheros y entrada/salida (I/O): 
Java proporciona una API para trabajar con archivos y para leer y escribir datos en diferentes formatos, como texto y binario. La entrada y salida de datos es una tarea fundamental en cualquier aplicación, y Java proporciona una gran cantidad de herramientas para facilitar esta tarea.

Ejemplo:

```java
// Escritura en archivo
try {
    FileWriter fileWriter = new FileWriter("file.txt");
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    bufferedWriter.write("Este es el contenido del archivo");
    bufferedWriter.close();
} catch (IOException e) {
    e.printStackTrace();
}

// Lectura de archivo
try {
    FileReader fileReader = new FileReader("file.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = bufferedReader.readLine();
    System.out.println(line);
    bufferedReader.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Reflection:
La reflexión es una técnica avanzada de programación que permite a una aplicación examinar su propia estructura en tiempo de ejecución. Esto significa que la aplicación puede obtener información sobre sus propias clases, métodos y atributos, y modificar su comportamiento en tiempo de ejecución.

Ejemplo:

```java
// Obtener los métodos de una clase y ejecutarlos
Class<?> cls = MyObject.class;
Method[] methods = cls.getDeclaredMethods();
for (Method method : methods) {
    method.invoke(new MyObject(), null);
}
```

## Generics:
Los genéricos son una herramienta avanzada de programación que permite definir clases y métodos que pueden trabajar con diferentes tipos de datos. Esto aumenta la reutilización del código y hace que la aplicación sea más segura y fácil de mantener.

Ejemplo:

```java
// Clase genérica
public class MyGenericClass<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// Uso de la clase genérica
MyGenericClass<Integer> myInt = new MyGenericClass<>();
myInt.setValue(42);
System.out.println(myInt.getValue());

MyGenericClass<String> myString = new MyGenericClass<>();
myString.setValue("Hola, mundo");
System.out.println(myString.getValue());
```

## Anotaciones (annotations): 
Las anotaciones son una herramienta avanzada de programación que permite agregar metadatos a las clases, métodos y atributos de una aplicación. Esto puede ser útil para facilitar la documentación del código, para generar código automáticamente, o para agregar funcionalidades adicionales a la aplicación.

Ejemplo:

```java
// Anotación personalizada
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value() default "default";
}

// Uso de la anotación
public class MyClass {
    @MyAnnotation("Hola, mundo")
    public void myMethod() {
        // ...
    }
}
```

## Lambdas y funciones:
Las lambdas y funciones son una herramienta avanzada de programación que permite definir bloques de código como objetos que pueden ser pasados como parámetros a otros métodos o clases. Esto permite escribir código más legible y conciso, y facilita la programación funcional en Java.

Ejemplo:

```java
// Funciones de orden superior
public static int operate(int a, int b, IntBinaryOperator operator) {
    return operator.applyAsInt(a, b);
}

public static void main(String[] args) {
    int result = operate(5, 7, (a, b) -> a + b);
    System.out.println(result);
}
```
