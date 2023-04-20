![encapsulacion](https://user-images.githubusercontent.com/75398496/233363058-4759600d-52a0-47f8-aff4-ef07ffc2b90f.png)

# Encapsulación en Java:
La encapsulación es una técnica de programación que consiste en ocultar los detalles internos de una clase y proteger los datos y el comportamiento de la misma. Se utiliza para mantener la integridad de los datos y prevenir cambios no autorizados desde fuera de la clase.

En Java, la encapsulación se logra definiendo los campos de la clase como privados y proporcionando métodos públicos para acceder y modificar esos campos. Estos métodos se llaman "getters" y "setters", y se utilizan para obtener y establecer los valores de los campos privados respectivamente.

Ejemplo:

Aquí te proporciono un ejemplo de clase con encapsulación en Java:

```java
public class Persona {
   private String nombre;
   private int edad;

   public Persona(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }
}
```

En este ejemplo, se define una clase "Persona" con dos campos privados: "nombre" y "edad". Se proporcionan los métodos "getters" y "setters" públicos para acceder y modificar los valores de los campos privados.

El método "getNombre()" devuelve el valor del campo "nombre", y el método "setNombre()" establece el valor del campo "nombre".

El método "getEdad()" devuelve el valor del campo "edad", y el método "setEdad()" establece el valor del campo "edad".

Ejemplo:

Aquí te proporciono un breve ejemplo de cómo utilizar la clase "Persona" con encapsulación en Java:

```java
public class EjemploEncapsulacion {

   public static void main(String[] args) {
      Persona persona1 = new Persona("Juan", 25);
      System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
      persona1.setEdad(30);
      System.out.println(persona1.getNombre() + " ahora tiene " + persona1.getEdad() + " años.");
   }
}
```

En este ejemplo, se define una clase "EjemploEncapsulacion" que contiene un método principal llamado "main". Dentro del método principal, se crea un objeto de la clase "Persona" utilizando el constructor que toma dos argumentos: "nombre" y "edad". Luego, se llama a los métodos públicos "getters" de la clase "Persona" para obtener los valores de los campos "nombre" y "edad" del objeto creado, y se imprimen en la consola.

Luego, se llama al método "setter" público "setEdad()" de la clase "Persona" para establecer un nuevo valor para el campo "edad" del objeto creado. Finalmente, se llama a los métodos públicos "getters" de la clase "Persona" para obtener los nuevos valores de los campos "nombre" y "edad" del objeto creado, y se imprimen en la consola.
