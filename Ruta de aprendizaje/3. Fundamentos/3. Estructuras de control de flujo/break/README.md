# La estructura break en Java:
Se utiliza para salir de un bucle (ya sea for, while o do-while) si se cumple una condición determinada. La sintaxis básica de la estructura break en Java es la siguiente:
```java
for (inicialización; condición; incremento/decremento) {
    if (condición_para_salida) {
        break;
    }
    // Código a ejecutar mientras la condición no se cumpla
}
```
El código dentro del for se ejecuta de forma repetitiva mientras se cumpla la condición. Si se cumple la condición de salida, la instrucción break interrumpe la ejecución del bucle y se sale del mismo. Si la condición de salida no se cumple, se ejecuta el código dentro del bloque de llaves.

Ejemplo:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        while (true) {
            System.out.print("Introduce un número positivo: ");
            numero = sc.nextInt();
            
            if (numero < 0) {
                break;
            }
            
            System.out.println("El número introducido es " + numero);
        }
    }
}
```

En este ejemplo, se utiliza la estructura while para pedir al usuario que introduzca un número positivo. Si el usuario introduce un número negativo, la instrucción break interrumpe el bucle y se sale del mismo. Si el usuario introduce un número positivo, se muestra un mensaje en la pantalla con el número introducido.

En este caso, la condición true dentro del while indica que el bucle se ejecutará infinitamente, a menos que se cumpla la condición para la instrucción break. Si el usuario introduce un número negativo, la condición numero < 0 se cumple y se ejecuta la instrucción break, saliendo del bucle. Si el usuario introduce un número positivo, se ejecuta el código dentro del bloque de llaves y se vuelve al principio del bucle, solicitando al usuario que introduzca otro número.
