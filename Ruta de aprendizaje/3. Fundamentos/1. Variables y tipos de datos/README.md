![21](https://user-images.githubusercontent.com/75398496/222225574-0ceb641f-e502-459b-bf59-40941c0a6a01.png)

En Java, los operadores son símbolos que representan una acción que se realizará sobre uno o más valores. Las expresiones son combinaciones de operadores y operandos que se evalúan para producir un valor.

A continuación se describen los principales operadores y expresiones en Java:

## Operadores aritméticos:
Se utilizan para realizar operaciones matemáticas básicas. Ejemplo:

``` java
/* Suma (+): se utiliza para sumar dos valores. */

int result = 3 + 4; // result = 7
```

## Operadores de asignación:
Se utilizan para asignar valores a variables. Ejemplo:
``` java
/* Asignación de resta (-=): se utiliza para restar un valor a una variable y 
asignar el resultado a la misma variable. */

int result = 7;
result -= 5 // result = 2
```

## Operadores de comparación:
Se utilizan para comparar dos valores. Ejemplo:
``` java
/* Desigualdad (!=): se utiliza para comprobar si dos valores son diferentes.
asignar el resultado a la misma variable. */

int result = 2;
if(result != 5) {
    System.out.println("Los números no son iguales.");
}
```

## Operadores lógicos:
Se utilizan para combinar expresiones lógicas. Ejemplo:
``` java
/* NOT lógico (!): se utiliza para negar el resultado de una expresión. */

boolean tmp = false;
if(!tmp) { // Si el negativo de tmp es true
    System.out.println("Verdadero.");
}
```

## Operadores bit a bit:
Se utilizan para manipular bits individuales en un valor. Ejemplo:
``` java
/* XOR bit a bit (^): se utiliza para realizar una operación XOR en cada bit de dos valores. */

int a = 7; // 0111 en binario
int b = 10; // 1010 en binario

int result = a ^ b; // XOR bit a bit

System.out.println("El resultado de a XOR b es: " + result); // result =  13 (1101 en binario)
```

## Operadores de incremento/decremento:
Se utilizan para incrementar o decrementar el valor de una variable. Ejemplo:
``` java
/* Decremento (--): se utiliza para disminuir el valor de una variable en 1. */

int a = 2;
a--; // a = 1;
```

## Operadores condicionales:
Se utilizan para realizar operaciones condicionales. Ejemplo:
``` java
/* Operador ternario (?): se utiliza para hacer una evaluación condicional en una sola línea de código. */

boolean result = 4 < 5 ? true : false; // result = true
```

## Operadores de instancia y de tipo:
Se utilizan para comprobar si un objeto es de cierto tipo. Ejemplo:
``` java
/* Operador de instancia (instanceof): se utiliza para comprobar si un objeto 
es de una clase o de una subclase particular. 
Supongamos que tenemos una clase llamada Persona y otra clase llamada Empleado 
que extiende la clase Persona. */

Persona persona = new Empleado("Juan", "Perez", 35, "Desarrollador");
if (persona instanceof Empleado) {
    System.out.println("La persona es un empleado");
}
```

## Operadores de concatenación:
Se utilizan para concatenar cadenas de caracteres. Ejemplo:
``` java
/* Concatenación (+): se utiliza para unir dos cadenas de caracteres. */

String name = "Tito";
String surname = "Dev";
String fullName = name + surname;

System.out.println("El nombre completo es: " + fullName); // El nombre completo es: TitoDev
```

## Operadores de expresiones regulares:
Se utilizan para realizar búsquedas de patrones en cadenas de caracteres. Ejemplo:
``` java
/* Suma (+): se utiliza para sumar dos valores. */

int result = 3 + 4; // result = 7
```
- Expresión regular (~): se utiliza para buscar patrones en una cadena de caracteres. La sintaxis es: cadena ~ patrón.

Es importante mencionar que el orden de evaluación de las expresiones en Java está determinado por la precedencia de los operadores. Por lo general, los operadores con mayor precedencia se evalúan primero. Sin embargo, se puede utilizar paréntesis para forzar un orden de evaluación diferente.
