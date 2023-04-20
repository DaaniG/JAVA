![interfaces](https://user-images.githubusercontent.com/75398496/233380994-28d5e9a5-de5c-4697-bfe6-2c045b9665e9.png)

# Interfaces en Java:
En Java, una interfaz es una colección de métodos abstractos y constantes que pueden ser implementados por cualquier clase. Las interfaces se utilizan para definir un conjunto de comportamientos que una clase debe implementar.

Ejemplo:

Supongamos que necesitamos definir una interfaz para un objeto que puede ser dibujado en la pantalla. Podemos definir una interfaz llamada "Dibujable" de la siguiente manera:

```java
public interface Dibujable {
   void dibujar();
   void borrar();
}
```

En este ejemplo, la interfaz "Dibujable" contiene dos métodos abstractos: "dibujar()" y "borrar()". Cualquier clase que implemente esta interfaz debe proporcionar implementaciones concretas para estos métodos.

Ahora, podemos crear una clase "Rectangulo" que implemente la interfaz "Dibujable":

```java
public class Rectangulo implements Dibujable {
   private int x;
   private int y;
   private int ancho;
   private int alto;

   public Rectangulo(int x, int y, int ancho, int alto) {
      this.x = x;
      this.y = y;
      this.ancho = ancho;
      this.alto = alto;
   }

   @Override
   public void dibujar() {
      // Código para dibujar un rectángulo en la pantalla
   }

   @Override
   public void borrar() {
      // Código para borrar un rectángulo de la pantalla
   }
}
```

En este ejemplo, la clase "Rectangulo" implementa la interfaz "Dibujable" y proporciona implementaciones concretas para los métodos "dibujar()" y "borrar()".

Finalmente, podemos crear un objeto de la clase "Rectangulo" y llamar a los métodos de la interfaz "Dibujable" para dibujar y borrar el rectángulo en la pantalla:

```java
public class EjemploInterfaz {
   public static void main(String[] args) {
      Dibujable rectangulo = new Rectangulo(10, 10, 100, 50);
      rectangulo.dibujar();
      rectangulo.borrar();
   }
}
```

En este ejemplo, se crea un objeto de la clase "Rectangulo" y se asigna a una variable de tipo "Dibujable". Luego, se llama a los métodos "dibujar()" y "borrar()" de la interfaz "Dibujable" para dibujar y borrar el rectángulo en la pantalla.
