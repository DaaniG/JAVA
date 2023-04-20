![polimorfismo](https://user-images.githubusercontent.com/75398496/233378280-e8a63536-4046-4396-907a-7b7134c7bb44.png)

# Polimorfismo en Java:
El polimorfismo es una técnica de programación que permite que un objeto pueda tomar diferentes formas y comportarse de manera diferente en función del contexto en el que se utiliza. En Java, el polimorfismo se logra mediante el uso de clases y métodos que son comunes a múltiples clases, lo que permite que un objeto de una clase se comporte como si fuera de otra clase.

Un ejemplo sencillo de polimorfismo en Java es el siguiente:

```java
public class Animal {
   public void hacerSonido() {
      System.out.println("El animal hace un sonido.");
   }
}

public class Perro extends Animal {
   public void hacerSonido() {
      System.out.println("El perro hace un ladrido.");
   }
}

public class Gato extends Animal {
   public void hacerSonido() {
      System.out.println("El gato hace un maullido.");
   }
}

public class EjemploPolimorfismo {
   public static void main(String[] args) {
      Animal miAnimal = new Animal();
      Animal miPerro = new Perro();
      Animal miGato = new Gato();
      
      miAnimal.hacerSonido();
      miPerro.hacerSonido();
      miGato.hacerSonido();
   }
}
```
En este ejemplo, se define una clase abstracta "Animal" con un método "hacerSonido()", que simplemente imprime un mensaje en la consola.

Luego, se definen dos clases que extienden la clase "Animal": "Perro" y "Gato". Cada una de estas clases proporciona su propia implementación del método "hacerSonido()", que imprime un mensaje diferente en la consola.

Por último, se define una clase "EjemploPolimorfismo" que contiene un método principal "main". Dentro del método principal, se crean tres objetos: uno de la clase "Animal", uno de la clase "Perro" y uno de la clase "Gato". Luego, se llama al método "hacerSonido()" en cada uno de estos objetos.

Como resultado, se imprime en la consola el siguiente mensaje:

```java
El animal hace un sonido.
El perro hace un ladrido.
El gato hace un maullido.
```
En este ejemplo, se puede observar que los objetos "miPerro" y "miGato" se comportan de manera diferente al objeto "miAnimal" al llamar al método "hacerSonido()". Esto es posible gracias al polimorfismo, ya que los objetos "miPerro" y "miGato" son del tipo "Animal", pero también son del tipo "Perro" y "Gato", respectivamente, lo que les permite utilizar su propia implementación del método "hacerSonido()".
