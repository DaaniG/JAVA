![instanciatipo](https://user-images.githubusercontent.com/75398496/228673646-2ec065d2-e12b-43b1-9e51-21d4faee59d1.png)

Los operadores de instancia y de tipo en Java son fundamentales para trabajar con objetos y tipos de datos. A continuación, te explicaré la teoría de cada uno de ellos y te daré algunos ejemplos de su uso:

## Operador de instancia:

El operador de instancia en Java se utiliza para comprobar si un objeto es una instancia de una clase en particular. Este operador se representa por la palabra reservada "instanceof".

La sintaxis básica del operador de instancia es la siguiente:

```java
objeto instanceof Clase
```

Donde "objeto" es el objeto que queremos comprobar y "Clase" es la clase a la que queremos verificar si pertenece.
Aquí hay algunos ejemplos de cómo se puede utilizar el operador de instancia:

```java
String cadena = "Hola Mundo";
boolean esCadena = cadena instanceof String; // devuelve true

Integer entero = new Integer(10);
boolean esEntero = entero instanceof Integer; // devuelve true

Double doble = new Double(3.1416);
boolean esDoble = doble instanceof Integer; // devuelve false
```

En el primer ejemplo, estamos comprobando si la variable "cadena" es una instancia de la clase String, lo que devuelve "true". En el segundo ejemplo, estamos comprobando si la variable "entero" es una instancia de la clase Integer, lo que también devuelve "true". En el tercer ejemplo, estamos comprobando si la variable "doble" es una instancia de la clase Integer, lo que devuelve "false" ya que "doble" es una instancia de la clase Double y no de Integer.

## Operador de tipo:
El operador de tipo en Java se utiliza para comprobar si un objeto es de un tipo de dato en particular. Este operador se representa por la palabra reservada "typeof".

La sintaxis básica del operador de tipo es la siguiente:

```java
typeof(variable)
```

Donde "variable" es la variable que queremos comprobar.

Aquí hay algunos ejemplos de cómo se puede utilizar el operador de tipo:

```java
String cadena = "Hola Mundo";
System.out.println(typeof(cadena)); // muestra "java.lang.String"

int numero = 10;
System.out.println(typeof(numero)); // muestra "int"

double decimal = 3.1416;
System.out.println(typeof(decimal)); // muestra "double"
```

En el primer ejemplo, estamos comprobando el tipo de la variable "cadena", que es de tipo String, lo que devuelve "java.lang.String". En el segundo ejemplo, estamos comprobando el tipo de la variable "numero", que es de tipo int, lo que devuelve "int". En el tercer ejemplo, estamos comprobando el tipo de la variable "decimal", que es de tipo double, lo que devuelve "double".
