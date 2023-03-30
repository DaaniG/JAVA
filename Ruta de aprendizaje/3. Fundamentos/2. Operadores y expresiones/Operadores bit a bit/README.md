![bitbit](https://user-images.githubusercontent.com/75398496/228647988-24993f73-455d-445d-985f-488bf7f03fb3.png)

Los operadores bit a bit son operadores que se aplican a nivel de bits en valores enteros. En Java, los operadores bit a bit se aplican a los bits individuales de un número entero y producen un nuevo valor entero.

Java tiene los siguientes operadores bit a bit:

## AND a nivel de bits (&):
Realiza una operación AND a nivel de bits en dos valores enteros y devuelve un nuevo valor entero.
```java
int resultado = 6 & 3; // resultado será igual a 2 (en binario: 110 & 011 = 010)
```

## OR a nivel de bits (|):
Realiza una operación OR a nivel de bits en dos valores enteros y devuelve un nuevo valor entero.
```java
int resultado = 6 | 3; // resultado será igual a 7 (en binario: 110 | 011 = 111)
```

## XOR a nivel de bits (^):
Realiza una operación XOR a nivel de bits en dos valores enteros y devuelve un nuevo valor entero.
```java
int resultado = 6 ^ 3; // resultado será igual a 5 (en binario: 110 ^ 011 = 101)
```

## Complemento a uno (~):
Realiza una operación de complemento a uno en un valor entero y devuelve un nuevo valor entero.
```java
int resultado = ~6; // resultado será igual a -7 (en binario: ~110 = -111)
```

## Desplazamiento a la izquierda (<<):
Realiza una operación de desplazamiento a la izquierda en un valor entero y devuelve un nuevo valor entero. El valor se desplaza a la izquierda la cantidad especificada de bits, y se rellena con ceros a la derecha.
```java
int resultado = 6 << 2; // resultado será igual a 24 (en binario: 110 << 2 = 11000)
```

## Desplazamiento a la derecha con signo (>>):
Realiza una operación de desplazamiento a la derecha en un valor entero y devuelve un nuevo valor entero. El valor se desplaza a la derecha la cantidad especificada de bits, y se rellena con el bit de signo a la izquierda (es decir, se extiende el signo).
```java
int resultado = -6 >> 2; // resultado será igual a -2 (en binario: 11111111111111111111111111111010 >> 2 = 11111111111111111111111111111110)
```

## Desplazamiento a la derecha sin signo (>>>):
Realiza una operación de desplazamiento a la derecha sin signo en un valor entero y devuelve un nuevo valor entero. El valor se desplaza a la derecha la cantidad especificada de bits, y se rellena con ceros a la izquierda.
```java
int resultado = -6 >>> 2; // resultado será igual a 1073741822 (en binario: 11111111111111111111111111111010 >>> 2 = 00111111111111111111111111111110)
```
