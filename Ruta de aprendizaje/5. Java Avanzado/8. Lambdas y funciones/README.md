![lambdas](https://user-images.githubusercontent.com/75398496/233716253-213cedd1-f5e7-492f-a214-57e99e6d06e6.png)

# Lambdas y funciones en Java
Las lambdas y las funciones son características de Java que permiten el uso de expresiones más concisas y simplifican el código. En Java, una lambda es una función anónima que puede ser tratada como un objeto. Una función es una interfaz funcional que define un método abstracto que se puede usar para definir una lambda.

Las lambdas y las funciones se utilizan principalmente para simplificar el código y hacerlo más fácil de leer. También son útiles para trabajar con colecciones de objetos, ya que permiten definir funciones que se pueden aplicar a cada objeto de la colección.

Ejemplo de lambda:
Supongamos que tenemos una lista de strings que queremos ordenar en orden alfabético. Podemos utilizar una lambda para definir la función de comparación que se utiliza para ordenar los elementos de la lista:

```java
List<String> nombres = Arrays.asList("Juan", "Pedro", "Ana", "Luis");
Collections.sort(nombres, (s1, s2) -> s1.compareTo(s2));
System.out.println(nombres); // Imprime [Ana, Juan, Luis, Pedro]
```

En este ejemplo, utilizamos la función sort de la clase Collections para ordenar la lista de nombres. En el segundo parámetro, definimos una lambda que compara dos strings y devuelve el resultado de la comparación.

Ejemplo de función:
Supongamos que queremos definir una función que tome dos números enteros como argumentos y devuelva su suma. Podemos definir una interfaz funcional con un método abstracto que toma dos enteros como argumentos y devuelve un entero:

```java
@FunctionalInterface
interface Suma {
  int sumar(int a, int b);
}
```

Luego, podemos definir una lambda que implemente esta interfaz funcional:

```java
Suma suma = (a, b) -> a + b;
```

Finalmente, podemos utilizar la función para sumar dos números:

```java
int resultado = suma.sumar(3, 5);
System.out.println(resultado); // Imprime 8
```

En este ejemplo, utilizamos la anotación @FunctionalInterface para indicar que la interfaz Suma es una interfaz funcional. Luego, definimos una lambda que implementa el método abstracto de la interfaz Suma. Por último, utilizamos la función para sumar dos números enteros.
