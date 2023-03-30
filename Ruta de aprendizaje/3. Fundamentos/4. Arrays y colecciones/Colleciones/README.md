# Las colecciones en Java:
Son estructuras de datos que se utilizan para almacenar y manipular colecciones de objetos. Las colecciones proporcionan una alternativa más flexible y potente a los arrays estáticos.

En Java, las colecciones se encuentran en el paquete java.util y se utilizan ampliamente en la programación para almacenar y manipular datos de forma dinámica. Las colecciones más comunes son las siguientes:

- ArrayList: una lista dinámica que permite agregar o eliminar elementos en cualquier posición de la lista.
- LinkedList: una lista doblemente enlazada que permite agregar o eliminar elementos en cualquier posición de la lista.
- HashSet: una colección que almacena elementos únicos sin orden específico.
- TreeSet: una colección que almacena elementos únicos en orden ascendente.
- HashMap: una colección que almacena pares clave-valor, donde cada clave es única y se utiliza para acceder a su valor correspondiente.
- TreeMap: una colección que almacena pares clave-valor en orden ascendente según la clave.

Para utilizar una colección en Java, primero se debe importar el paquete java.util y luego crear una instancia de la colección utilizando su constructor. Por ejemplo, para crear un ArrayList de cadenas, se puede utilizar el siguiente código:

```java
import java.util.ArrayList;

ArrayList<String> lista_de_cadenas = new ArrayList<String>();
````
Una vez que se ha creado la colección, se pueden agregar elementos utilizando el método add() y acceder a los elementos utilizando el método get(). Por ejemplo, para agregar una cadena a la lista anterior, se puede utilizar el siguiente código:
```java
lista_de_cadenas.add("Hola");
```
Ejemplo:

```java
import java.util.ArrayList;

ArrayList<String> lista_de_nombres = new ArrayList<String>();

lista_de_nombres.add("Juan");
lista_de_nombres.add("Pedro");
lista_de_nombres.add("María");

for (String nombre : lista_de_nombres) {
    System.out.println(nombre);
}
```
En este ejemplo, se utiliza un ArrayList para almacenar tres nombres y se utiliza un bucle for-each para recorrer la lista y mostrar cada uno de sus elementos.
