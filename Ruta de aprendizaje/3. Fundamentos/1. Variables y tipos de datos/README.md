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
Se utilizan para combinar expresiones lógicas. Incluyen:
- AND lógico (&&): se utiliza para comprobar si dos expresiones son verdaderas.
- OR lógico (||): se utiliza para comprobar si al menos una de dos expresiones es verdadera.
- NOT lógico (!): se utiliza para negar el resultado de una expresión.

## Operadores bit a bit:
Se utilizan para manipular bits individuales en un valor. Incluyen:
- AND bit a bit (&): se utiliza para realizar una operación AND en cada bit de dos valores.
- OR bit a bit (|): se utiliza para realizar una operación OR en cada bit de dos valores.
- XOR bit a bit (^): se utiliza para realizar una operación XOR en cada bit de dos valores.
- Desplazamiento a la izquierda (<<): se utiliza para desplazar los bits de un valor hacia la izquierda un número determinado de posiciones.
- Desplazamiento a la derecha (>>): se utiliza para desplazar los bits de un valor hacia la derecha un número determinado de posiciones.

## Operadores de incremento/decremento:
Se utilizan para incrementar o decrementar el valor de una variable. Incluyen:
- Incremento (++): se utiliza para aumentar el valor de una variable en 1.
- Decremento (--): se utiliza para disminuir el valor de una variable en 1.

## Operadores condicionales:
Se utilizan para realizar operaciones condicionales. Incluyen:
- Operador ternario (?): se utiliza para hacer una evaluación condicional en una sola línea de código. La sintaxis es: condición ? expresión1 : expresión2. Si la condición es verdadera, se devuelve la expresión1, de lo contrario se devuelve la expresión2.
- Null coalescing operator (??): se utiliza para devolver el valor de una expresión si no es nulo, de lo contrario devuelve un valor predeterminado. La sintaxis es: expresión1 ?? expresión2. Si la expresión1 no es nula, se devuelve la expresión1, de lo contrario se devuelve la expresión2.
### Operadores de instancia y de tipo:
Se utilizan para comprobar si un objeto es de cierto tipo. Incluyen:
- Operador de instancia (instanceof): se utiliza para comprobar si un objeto es de una clase o de una subclase particular. La sintaxis es: objeto instanceof Clase.
- Operador de tipo (typeof): se utiliza para obtener el tipo de datos de una expresión. La sintaxis es: typeof(expresión).

## Operadores de concatenación:
Se utilizan para concatenar cadenas de caracteres. Incluyen:
- Concatenación (+): se utiliza para unir dos cadenas de caracteres. Si uno de los operandos es una cadena, Java convierte automáticamente el otro operando en una cadena antes de realizar la concatenación.

## Operadores de expresiones regulares:
Se utilizan para realizar búsquedas de patrones en cadenas de caracteres. Incluyen:
- Expresión regular (~): se utiliza para buscar patrones en una cadena de caracteres. La sintaxis es: cadena ~ patrón.

Es importante mencionar que el orden de evaluación de las expresiones en Java está determinado por la precedencia de los operadores. Por lo general, los operadores con mayor precedencia se evalúan primero. Sin embargo, se puede utilizar paréntesis para forzar un orden de evaluación diferente.
