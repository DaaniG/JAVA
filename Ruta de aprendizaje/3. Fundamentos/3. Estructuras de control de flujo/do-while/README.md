# La estructura do-while en Java:
Se utiliza para repetir una sección de código al menos una vez, y luego repetirlo mientras se cumple una condición. La sintaxis básica de la estructura do-while en Java es la siguiente:

```java
do {
    // código a ejecutar al menos una vez
} while (condición);
```
El código dentro de las llaves se ejecuta al menos una vez, independientemente de si la condición es verdadera o falsa. Después de la primera iteración, se evalúa la condición y, si es verdadera, se ejecuta el código nuevamente. Este proceso se repite hasta que la condición es falsa.

Ejemplo:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduce un número positivo: ");
            numero = sc.nextInt();
        } while (numero < 0);
        
        System.out.println("El número introducido es " + numero);
    }
}
```

En este ejemplo, se utiliza la estructura do-while para pedir al usuario que introduzca un número positivo. Si el número introducido es negativo, se le pedirá al usuario que introduzca otro número hasta que introduzca un número positivo.

La variable "numero" se inicializa con un valor negativo para que el código dentro de las llaves se ejecute al menos una vez. Después de la primera iteración, se evalúa la condición "numero < 0" y, si es verdadera, se solicita al usuario que introduzca otro número. Este proceso se repite hasta que el usuario introduce un número positivo.
