
# La estructura if-else en Java:
Es una de las más utilizadas en programación. Se utiliza para tomar decisiones en función de una condición. La sintaxis básica de la estructura if-else en Java es la siguiente:
```java
if (condición) {
    // código a ejecutar si la condición es verdadera
} else {
    // código a ejecutar si la condición es falsa
}
```

La condición debe ser una expresión que se pueda evaluar como verdadera o falsa. Si la condición es verdadera, se ejecutará el bloque de código dentro del primer conjunto de llaves. Si la condición es falsa, se ejecutará el bloque de código dentro del segundo conjunto de llaves.

También se pueden utilizar múltiples estructuras if-else anidadas para tomar decisiones más complejas en función de varias condiciones. La sintaxis básica de una estructura if-else anidada es la siguiente:
```java
if (condición1) {
    // código a ejecutar si la condición1 es verdadera
} else if (condición2) {
    // código a ejecutar si la condición1 es falsa y la condición2 es verdadera
} else {
    // código a ejecutar si la condición1 y la condición2 son falsas
}
````

Ejemplo:
```java
public class Main {
    public static void main(String[] args) {
        int edad = 18;
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
```
En este ejemplo, se declara una variable llamada "edad" y se le asigna un valor de 18. Luego, se utiliza la estructura if-else para determinar si la edad es mayor o igual a 18. Si la edad es mayor o igual a 18, se imprime "Eres mayor de edad". De lo contrario, se imprime "Eres menor de edad".
