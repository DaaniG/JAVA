![condicionales](https://user-images.githubusercontent.com/75398496/228651095-8b245cc7-5721-4306-bf90-1b1364c9b806.png)

Los operadores condicionales se utilizan en expresiones booleanas para evaluar múltiples condiciones. En Java, los operadores condicionales devuelven un valor booleano verdadero o falso, dependiendo del resultado de la evaluación.

Java tiene los siguientes operadores condicionales:

## AND lógico (&&):
Devuelve verdadero si y solo si ambas expresiones booleanas son verdaderas. Si la primera expresión es falsa, no se evalúa la segunda expresión.
```java
boolean resultado = (4 < 5) && (3 > 1); // resultado será verdadero (ambas expresiones son verdaderas)
```

## OR lógico (||):
Devuelve verdadero si al menos una de las expresiones booleanas es verdadera. Si la primera expresión es verdadera, no se evalúa la segunda expresión.
```java
boolean resultado = (4 > 5) || (3 < 1); // resultado será verdadero (la segunda expresión es verdadera)
```

## NOT lógico (!):
Invierte el valor booleano de una expresión.
```java
boolean resultado = !(4 < 5); // resultado será falso (la expresión es verdadera, pero se invierte con el operador !)
```

Es importante tener en cuenta que los operadores condicionales evalúan las expresiones de izquierda a derecha, y pueden tener un efecto de cortocircuito si el resultado final ya se puede determinar después de evaluar una parte de la expresión.

Por ejemplo, en la expresión (4 < 5) && (3 > 1), la primera expresión es verdadera, por lo que el operador && evalúa la segunda expresión. En cambio, en la expresión (4 > 5) || (3 < 1), la primera expresión es falsa, por lo que el operador || no evalúa la segunda expresión, ya que no es necesario para determinar el resultado final.
