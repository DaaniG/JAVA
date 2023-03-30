![concatenacion](https://user-images.githubusercontent.com/75398496/228665322-8d0088f0-5055-41be-9ced-79b7dbb4fb73.png)

Los operadores de concatenación se utilizan en Java para combinar dos cadenas de caracteres o para combinar una cadena y un valor numérico u otro objeto. Los operadores de concatenación disponibles en Java son los siguientes:

## Concatenación (+):
El operador de concatenación se utiliza para combinar dos cadenas de caracteres.
```java
String cadena1 = "Hola ";
String cadena2 = "Mundo";
String resultado = cadena1 + cadena2; // El valor de resultado será "Hola Mundo"
```

## Concatenación con valor numérico: 
El operador de concatenación también se puede utilizar para combinar una cadena y un valor numérico. En este caso, el valor numérico se convierte automáticamente en una cadena antes de concatenarse.
```java
int x = 5;
String cadena = "El valor de x es: " + x; // El valor de cadena será "El valor de x es: 5"
```

## Concatenación con objetos: 
El operador de concatenación también se puede utilizar para combinar una cadena y otro objeto. En este caso, el objeto se convierte automáticamente en una cadena antes de concatenarse. 
```java
Date fecha = new Date();
String cadena = "La fecha actual es: " + fecha; // El valor de cadena será "La fecha actual es: Mon Mar 29 17:31:00 UTC 2023"
```
