![noprimitivos](https://user-images.githubusercontent.com/75398496/228880203-3a56c15a-73e9-4b97-9375-63196183e2ff.png)

Los tipos de datos no primitivos en Java son tipos de datos que no son definidos por el lenguaje en sí mismo, sino que son definidos por el programador o se incluyen en la biblioteca estándar de Java. A diferencia de los tipos de datos primitivos, que tienen un tamaño fijo y un conjunto limitado de valores, los tipos de datos no primitivos pueden ser de cualquier tamaño y contener cualquier tipo de datos.

### String:
Es una secuencia de caracteres. A diferencia de los tipos primitivos, que son palabras clave del lenguaje, el tipo de datos String se define en la biblioteca estándar de Java.
```java
String miString = "Hola mundo";
```

### Array:
Es una colección de elementos del mismo tipo de datos.
```java
int[] miArray = {1, 2, 3, 4, 5};
```

### Clase:
Una clase es un plano o modelo para crear objetos. Las clases son tipos de datos personalizados y se utilizan para definir objetos en Java.
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

  public int getEdad() {
    return edad;
  }
}
```

### Enumeraciones:
Una enumeración es un conjunto de valores constantes. Las enumeraciones se utilizan para definir un conjunto fijo de valores que se pueden asignar a una variable. 
```java
enum DiaSemana {
  LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
}

DiaSemana dia = DiaSemana.LUNES;
```

### Clases Wrapper:
Son clases que envuelven o encapsulan tipos de datos primitivos para permitirles comportarse como objetos. 
```java
Integer miInteger = new Integer(10);
```
