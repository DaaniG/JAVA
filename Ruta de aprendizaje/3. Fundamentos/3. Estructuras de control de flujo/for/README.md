# La estructura for en Java:
Se utiliza para repetir una sección de código un número específico de veces. La sintaxis básica de la estructura for en Java es la siguiente:
```java
for (inicialización; condición; actualización) {
    // código a ejecutar en cada iteración
}
```
La inicialización se utiliza para establecer el valor inicial de una variable de control. La condición es una expresión que se evalúa antes de cada iteración y, si es verdadera, se ejecuta el código dentro del bucle. La actualización se utiliza para cambiar el valor de la variable de control después de cada iteración.

También se pueden utilizar estructuras for anidadas para realizar iteraciones más complejas. La sintaxis básica de una estructura for anidada es la siguiente:
```java
for (inicialización1; condición1; actualización1) {
    for (inicialización2; condición2; actualización2) {
        // código a ejecutar en cada iteración
    }
}
```

Ejemplo:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

En este ejemplo, se utiliza la estructura for para imprimir los números del 1 al 10 en la consola. La variable de control "i" se inicializa en 1, se evalúa la condición "i <= 10" antes de cada iteración, y se incrementa en 1 después de cada iteración.
