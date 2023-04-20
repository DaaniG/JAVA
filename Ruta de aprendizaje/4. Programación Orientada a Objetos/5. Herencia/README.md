![herencia](https://user-images.githubusercontent.com/75398496/233371295-2683894f-3ba3-465c-81d9-b09f9ed07e0e.png)

# Herencia en Java:
La herencia es un mecanismo de programación en el cual una clase adquiere las propiedades y los métodos de otra clase. La clase original se llama "clase base" o "superclase", y la clase que adquiere las propiedades se llama "clase derivada" o "subclase".

En Java, la herencia se logra utilizando la palabra clave "extends". La clase derivada extiende la clase base y hereda todos sus campos y métodos públicos y protegidos. La clase derivada puede agregar nuevos campos y métodos, y también puede sobrescribir los métodos de la clase base.

Ejemplo:

Aquí te proporciono un ejemplo de herencia en Java:

```java
public class Vehiculo {
   private String marca;
   private String modelo;

   public Vehiculo(String marca, String modelo) {
      this.marca = marca;
      this.modelo = modelo;
   }

   public String getMarca() {
      return marca;
   }

   public String getModelo() {
      return modelo;
   }
}
```
```java
public class Coche extends Vehiculo {
   private int numPuertas;

   public Coche(String marca, String modelo, int numPuertas) {
      super(marca, modelo);
      this.numPuertas = numPuertas;
   }

   public int getNumPuertas() {
      return numPuertas;
   }
}
```

En este ejemplo, se define una clase "Vehiculo" con dos campos privados: "marca" y "modelo". Se proporcionan los métodos "getters" públicos para acceder a los valores de los campos privados.

Luego, se define una clase "Coche" que extiende la clase "Vehiculo". La clase "Coche" tiene un campo privado adicional llamado "numPuertas", y un constructor que toma tres argumentos: "marca", "modelo" y "numPuertas". El constructor de la clase "Coche" utiliza la palabra clave "super" para llamar al constructor de la clase "Vehiculo" y pasar los argumentos "marca" y "modelo" al constructor de la clase base.

La clase "Coche" también tiene un método "getter" público llamado "getNumPuertas()" que devuelve el valor del campo "numPuertas".

Ejemplo:

Aquí te proporciono un breve ejemplo de cómo utilizar la clase "Coche" con herencia en Java:

```java
public class EjemploHerencia {

   public static void main(String[] args) {
      Coche coche1 = new Coche("Ford", "Mustang", 2);
      System.out.println(coche1.getMarca() + " " + coche1.getModelo() + " tiene " + coche1.getNumPuertas() + " puertas.");
   }
}
```
En este ejemplo, se define una clase "EjemploHerencia" que contiene un método principal llamado "main". Dentro del método principal, se crea un objeto de la clase "Coche" utilizando el constructor que toma tres argumentos: "marca", "modelo" y "numPuertas". Luego, se llama al método "getter" público "getMarca()" de la clase "Vehiculo" para obtener el valor del campo "marca" del objeto creado, y se llama al método "getter" público "getModelo()" de la clase "Vehiculo" para obtener el valor del campo "modelo" del objeto creado. Finalmente, se llama al método "getter" público "getNumPuertas()" de la clase "Coche" para obtener el valor del campo "numPuertas"
