![clases](https://user-images.githubusercontent.com/75398496/228921231-78b626bd-5cb9-4bdb-bed9-aea8fe49f539.png)

# Clases en Java:
Es un modelo o plantilla para crear objetos que contienen variables y métodos relacionados. Los objetos son instancias de una clase y se utilizan para interactuar con el mundo exterior.

Una clase se define utilizando la palabra clave "class", seguida del nombre de la clase y su contenido encerrado entre llaves. Dentro de una clase se pueden definir variables, métodos y constructores. Una variable es una entidad que representa un valor o una referencia, mientras que un método es una función que realiza una tarea específica.

Una clase también puede contener constructores, que son métodos especiales que se utilizan para inicializar los objetos de la clase. Los constructores tienen el mismo nombre que la clase y no tienen tipo de retorno. Además, las clases pueden ser organizadas en paquetes, que son colecciones de clases relacionadas que se utilizan para mantener un orden en el código.

Ejemplo:

```java
public class Persona {
    // Declaración de variables
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que retorna el nombre de la persona
    public String getNombre() {
        return this.nombre;
    }

    // Método que retorna la edad de la persona
    public int getEdad() {
        return this.edad;
    }

    // Método que imprime información de la persona
    public void imprimirInfo() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }
}
```

En este ejemplo, se define una clase llamada "Persona" que contiene dos variables privadas (nombre y edad), un constructor y tres métodos públicos (getNombre, getEdad e imprimirInfo).

El constructor se utiliza para inicializar las variables de la clase, y los métodos getNombre y getEdad se utilizan para acceder a las variables privadas desde fuera de la clase. El método imprimirInfo se utiliza para imprimir información de la persona en la consola.

# Objetos en Java:
Para crear un objeto de la clase "Persona", se puede utilizar el siguiente código:

```java
Persona persona1 = new Persona("Juan", 30);
```

En este caso, se utiliza el constructor de la clase para crear un objeto "persona1" con el nombre "Juan" y la edad "30". Luego, se puede utilizar el método "imprimirInfo" para mostrar la información de la persona en la consola:

```java
persona1.imprimirInfo();
```

Este código producirá la salida siguiente:

```java
Nombre: Juan, Edad: 30
```
