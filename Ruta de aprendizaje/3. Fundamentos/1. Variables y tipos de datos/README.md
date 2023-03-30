![21](https://user-images.githubusercontent.com/75398496/222225574-0ceb641f-e502-459b-bf59-40941c0a6a01.png)

## Variables:
Las variables son contenedores de datos que se utilizan para almacenar valores en la memoria de un programa. En Java, se pueden declarar variables de diferentes tipos de datos.

Ejemplo:

```java
int edad = 25; // variable de tipo entero que almacena la edad
double precio = 14.99; // variable de tipo decimal que almacena el precio
String nombre = "Juan"; // variable de tipo cadena de caracteres que almacena el nombre
```
## Tipos de datos:
### Primitivos:
Son tipos de datos simples que se utilizan para almacenar valores básicos. Los tipos de datos primitivos son ocho en total y se pueden clasificar en cuatro grupos:

- Enteros: byte, short, int, long
- Punto flotante: float, double
- Caracteres: char
- Booleanos: boolean

Los tipos de datos primitivos son inmutables, es decir, una vez que se les asigna un valor, no se pueden cambiar. También tienen una representación fija en memoria, lo que significa que se puede calcular la cantidad de memoria que utilizará cada tipo de dato primitivo.

| Tipo de dato | Descripción                                         |
|--------------|-----------------------------------------------------|
| byte         | Almacena un valor entero de 8 bits                  |
| short        | Almacena un valor entero de 16 bits                 |
| int          | Almacena un valor entero de 32 bits                 |
| long         | Almacena un valor entero de 64 bits                 |
| float        | Almacena un valor de coma flotante de 32 bits       |
| double       | Almacena un valor de coma flotante de 64 bits       |
| boolean      | Almacena un valor booleano (true o false)           |
| char         | Almacena un valor de carácter Unicode de 16 bits    |

### No primitivos:
Son tipos de datos complejos que se utilizan para representar objetos y estructuras de datos. Los tipos de datos no primitivos se crean a partir de tipos de datos primitivos o de otros objetos y son variables que almacenan una referencia a un objeto en lugar de los datos del objeto en sí.

Los tres tipos de datos no primitivos en Java son:

- String: una secuencia de caracteres.
- Arrays: una colección de elementos del mismo tipo.
- Clases personalizadas: objetos personalizados creados por el usuario.

Los tipos de datos no primitivos son mutables, es decir, los valores que contienen pueden cambiar. Además, los tipos de datos no primitivos no tienen una representación fija en memoria, lo que significa que el tamaño de memoria que ocupan depende del objeto que estén almacenando y de su estado actual.

| Tipo de dato         | Descripción                                               |
|----------------------|-----------------------------------------------------------|
| String               | Almacena una secuencia de caracteres                      |
| Arrays               | Almacena una colección de elementos del mismo tipo        |
| Clases personalizadas| Almacena objetos personalizados creados por el usuario    |
