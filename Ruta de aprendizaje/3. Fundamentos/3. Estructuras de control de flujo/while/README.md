# La estructura while en Java:
Se utiliza para repetir una sección de código mientras se cumple una condición. La sintaxis básica de la estructura while en Java es la siguiente:

```java
while (condición) {
    // código a ejecutar mientras la condición sea verdadera
}
```
El código dentro de las llaves se ejecuta solo si la condición es verdadera. Si la condición es falsa desde el principio, el código dentro de las llaves nunca se ejecutará.

Ejemplo:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Introduce un número positivo: ");
        numero = sc.nextInt();
        
        while (numero < 0) {
            System.out.print("El número introducido es negativo. Introduce otro número: ");
            numero = sc.nextInt();
        }
        
        System.out.println("El número introducido es " + numero);
    }
}
```

En este ejemplo, se utiliza la estructura while para pedir al usuario que introduzca un número positivo. Si el número introducido es negativo, se le pedirá al usuario que introduzca otro número hasta que introduzca un número positivo.

En este caso, la condición "numero < 0" se evalúa antes de entrar en el bucle. Si la condición es verdadera, se ejecuta el código dentro del bucle while y se le solicita al usuario que introduzca otro número. Este proceso se repite hasta que el usuario introduce un número positivo.
