![metyfun](https://user-images.githubusercontent.com/75398496/228928350-be86cb77-ee79-4416-a1f0-0f54d955b186.png)

# Los métodos y funciones en Java:
Son bloques de código reutilizable que se pueden llamar desde otros lugares en el programa. Los métodos y funciones permiten al programador dividir el código en fragmentos más pequeños y más manejables, lo que facilita el mantenimiento y la legibilidad del código.

En Java, los métodos y funciones se definen dentro de una clase y se pueden llamar desde cualquier parte del programa. Los métodos y funciones pueden recibir argumentos o parámetros, y pueden devolver un valor de retorno o no.

Los métodos y funciones se definen mediante la palabra clave "public" o "private", seguida del tipo de dato que devuelven (o la palabra clave "void" si no devuelven nada), seguido del nombre del método y una lista de argumentos entre paréntesis. Por ejemplo:
```java
public int sumar(int num1, int num2) {
   int resultado = num1 + num2;
   return resultado;
}
```

En este ejemplo, se define un método público llamado "sumar" que toma dos argumentos de tipo entero y devuelve un valor de tipo entero.

Ejemplo:

Aquí te proporciono un breve ejemplo de métodos y funciones en Java:
```java
public class EjemploMetodos {

   public static void main(String[] args) {
      int resultado = sumar(3, 4);
      System.out.println(resultado);
   }

   public static int sumar(int num1, int num2) {
      int resultado = num1 + num2;
      return resultado;
   }
}
```
En este ejemplo, se define una clase llamada "EjemploMetodos" que contiene un método principal llamado "main". Dentro del método principal, se llama al método "sumar" que toma dos argumentos y devuelve un valor, y se imprime el resultado en la consola.
