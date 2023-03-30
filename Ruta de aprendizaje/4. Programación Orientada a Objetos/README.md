![poo](https://user-images.githubusercontent.com/75398496/228926500-82ef227e-5fa5-4338-9ec3-caf623e42794.png)
## Clases y objetos:

Una clase se define utilizando la palabra clave "class", seguida del nombre de la clase y las llaves que delimitan su cuerpo. Para crear un objeto de una clase, se utiliza la palabra clave "new" seguida del nombre de la clase y los paréntesis que delimitan los argumentos que se le pasan al constructor.

Ejemplo:

```java
public class Coche {
    String marca;
    String modelo;
    String color;
    
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public void acelerar() {
        System.out.println("El coche acelera");
    }
    
    public void frenar() {
        System.out.println("El coche frena");
    }
}

// Crear un objeto de la clase Coche
Coche miCoche = new Coche("Ford", "Mustang", "Rojo");
```

## Métodos y funciones:

Los métodos se definen dentro de una clase utilizando la sintaxis "public void nombreDelMetodo() { ... }". Las funciones se definen fuera de una clase utilizando la sintaxis "public static tipoDeRetorno nombreDeLaFuncion(argumentos) { ... }".

Ejemplo:

```java
public class Coche {
    // atributos
    
    public void acelerar() {
        System.out.println("El coche acelera");
    }
    
    public void frenar() {
        System.out.println("El coche frena");
    }
}

// Definir una función que suma dos números
public static int sumar(int a, int b) {
    return a + b;
}

// Llamar a la función para sumar dos números
int resultado = sumar(2, 3);
```

## Constructores:

Un constructor se define dentro de una clase utilizando la sintaxis "public nombreDeLaClase(argumentos) { ... }". El constructor puede inicializar los atributos de la clase utilizando la palabra clave "this".

Ejemplo:

```java
public class Coche {
    String marca;
    String modelo;
    String color;
    
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    // métodos
}

// Crear un objeto de la clase Coche utilizando el constructor
Coche miCoche = new Coche("Ford", "Mustang", "Rojo");
```
## Paquetes y módulos:

Los paquetes y módulos permiten organizar las clases de Java en grupos lógicos para facilitar su gestión y evitar conflictos de nombres. Los paquetes son el mecanismo de agrupación utilizado en Java antes de la versión 9, mientras que los módulos se introdujeron en Java 9 para proporcionar una forma más sofisticada de organizar las clases.

Ejemplo:

```java
// Clase en un paquete
package com.miempresa.miproyecto;

public class MiClase {
    // atributos y métodos
}

// Importar una clase de otro paquete
import com.otraempresa.otroproyecto.OtraClase;

public class Principal {
    public static void main(String[] args) {
        // Crear objetos de las clases importadas
        MiClase miObjeto = new MiClase();
        OtraClase otroObjeto = new OtraClase();
    }
}
```

## Encapsulación:

La encapsulación se refiere a ocultar los detalles internos de una clase y proporcionar una interfaz pública para interactuar con ella. Los atributos de la clase se definen como privados y se acceden a ellos mediante métodos públicos.

Ejemplo:

```java
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // métodos para acceder a los atributos privados
}

// Crear un objeto de la clase Coche
Coche miCoche = new Coche("Ford", "Mustang", "Rojo");

// Acceder al atributo privado marca a través de los métodos públicos
String marca = miCoche.getMarca();
miCoche.setMarca("Toyota");
```

## Herencia:

La herencia permite crear una nueva clase a partir de una clase existente y añadir nuevos atributos y métodos. La clase hija se define utilizando la palabra clave "extends" seguida del nombre de la clase padre.

Ejemplo:

```java
public class Vehiculo {
    String marca;
    String modelo;
    String color;
    
    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public void acelerar() {
        System.out.println("El vehículo acelera");
    }
    
    public void frenar() {
        System.out.println("El vehículo frena");
    }
}

public class Coche extends Vehiculo {
    int numPuertas;
    
    public Coche(String marca, String modelo, String color, int numPuertas) {
        super(marca, modelo, color);
        this.numPuertas = numPuertas;
    }
    
    public void abrirPuertas() {
        System.out.println("El coche abre las puertas");
    }
    
    // métodos para acceder a los atributos heredados de la clase Vehiculo
}

// Crear un objeto de la clase Coche
Coche miCoche = new Coche("Ford", "Mustang", "Rojo", 2);
```

## Polimorfismo:

El polimorfismo permite utilizar una misma variable o método con diferentes tipos de objetos. Se pueden crear variables de un tipo de clase y asignarles objetos de clases hijas. También se pueden crear métodos que acepten objetos de diferentes clases.

Ejemplo:

```java
public class Vehiculo {
    // atributos y métodos
}

public class Coche extends Vehiculo {
    // atributos y métodos
}

public class Moto extends Vehiculo {
    // atributos y métodos
}

// Crear un objeto de la clase Coche y un objeto de la clase Moto
Coche miCoche = new Coche("Ford", "Mustang", "Rojo", 2);
Moto miMoto = new Moto("Honda", "CBR", "Negra");

// Utilizar una misma variable con diferentes tipos de objetos
Vehiculo miVehiculo = miCoche;
miVehiculo = miMoto;

// Crear un método que acepte objetos de diferentes clases
public void conducir(Vehiculo vehiculo) {
    vehiculo.acelerar();
    vehiculo.frenar();
}

// Llamar al método conducir con objetos de diferentes clases
conducir(miCoche);
conducir(miMoto);
```

## Interfaces:

Las interfaces son similares a las clases abstractas, pero sólo pueden contener métodos y constantes sin implementación. Una clase puede implementar una o varias interfaces, lo que obliga a la clase a proporcionar una implementación de los métodos definidos en las interfaces.

Ejemplo:

```java
public interface Transporte {
    public void acelerar();
    public void frenar();
}

public class Coche implements Transporte {
    // atributos y métodos
    
    public void acelerar() {
        System.out.println("El coche acelera");
    }
    
    public void frenar() {
        System.out.println("El coche frena");
    }
}

// Crear un objeto de la clase Coche
Coche miCoche = new Coche("Ford", "Mustang", "Rojo", 2);

// Llamar a los métodos definidos en la interfaz Transporte
miCoche.acelerar();
miCoche.frenar();
```
