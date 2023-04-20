![constructores](https://user-images.githubusercontent.com/75398496/233360037-2f787eca-f6e7-44b4-b55b-b121633d59b9.png)

# Constructores en Java:
Los constructores en Java son métodos especiales que se utilizan para inicializar objetos de una clase. Los constructores tienen el mismo nombre que la clase y no devuelven ningún valor de retorno.

La diferencia entre un constructor y un método normal es que un constructor se llama automáticamente cuando se crea un objeto de la clase, mientras que un método normal se llama explícitamente desde otro lugar del programa.

En Java, un constructor se define con el nombre de la clase, seguido de una lista de argumentos entre paréntesis. Por ejemplo:

```java
public class Persona {
   private String nombre;
   private int edad;

   public Persona(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
   }
}
```

En este ejemplo, se define una clase "Persona" que tiene dos campos privados: "nombre" y "edad". También se define un constructor público que toma dos argumentos: "nombre" y "edad". Dentro del constructor, se inicializan los campos de la clase utilizando los valores de los argumentos.

Ejemplo:

Aquí te proporciono un breve ejemplo de cómo utilizar un constructor en Java:

```java
public class EjemploConstructor {

   public static void main(String[] args) {
      Persona persona1 = new Persona("Juan", 25);
      System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
   }
}
```

En este ejemplo, se define una clase "EjemploConstructor" que contiene un método principal llamado "main". Dentro del método principal, se crea un objeto de la clase "Persona" utilizando el constructor que toma dos argumentos: "nombre" y "edad". Luego, se llama a dos métodos públicos de la clase "Persona" para obtener los valores de los campos "nombre" y "edad" del objeto creado, y se imprimen en la consola.
