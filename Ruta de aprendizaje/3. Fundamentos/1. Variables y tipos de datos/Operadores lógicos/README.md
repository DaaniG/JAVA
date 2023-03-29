![logico](https://user-images.githubusercontent.com/75398496/228675968-97eb8890-2849-4ee3-a6b1-8332823b0efd.png)

Se utilizan en Java para combinar expresiones lógicas. Incluyen:

## Operador lógico AND (&&)
El operador lógico AND se utiliza para comprobar si ambas expresiones son verdaderas o falsas. Este operador se representa por dos símbolos de ampersand "&&".

La sintaxis básica del operador lógico AND es la siguiente:

```java
expresión1 && expresión2
```
Donde "expresión1" y "expresión2" son las expresiones que queremos comprobar.

Aquí hay algunos ejemplos de cómo se puede utilizar el operador lógico AND:

```java
int numero = 10;
boolean esMayorQueCeroYMenorQueVeinte = numero > 0 && numero < 20; // devuelve true

boolean esVerdadero = true;
boolean esFalso = false;
boolean sonAmbosVerdaderos = esVerdadero && esFalso; // devuelve false
```

En el primer ejemplo, estamos comprobando si "numero" es mayor que cero y menor que veinte, lo que devuelve "true". En el segundo ejemplo, estamos comprobando si ambas variables "esVerdadero" y "esFalso" son verdaderas, lo que devuelve "false" ya que "esFalso" es falso.

## Operador lógico OR (||)
El operador lógico OR se utiliza para comprobar si al menos una de las expresiones es verdadera. Este operador se representa por dos símbolos de barra vertical "||".

La sintaxis básica del operador lógico OR es la siguiente:

```java
expresión1 || expresión2
```
Donde "expresión1" y "expresión2" son las expresiones que queremos comprobar.

Aquí hay algunos ejemplos de cómo se puede utilizar el operador lógico OR:

```java
int numero = 10;
boolean esMenorQueCeroOEsMayorQueVeinte = numero < 0 || numero > 20; // devuelve false

boolean esVerdadero = true;
boolean esFalso = false;
boolean esCualquierCosaVerdadera = esVerdadero || esFalso; // devuelve true
```

En el primer ejemplo, estamos comprobando si "numero" es menor que cero o mayor que veinte, lo que devuelve "false". En el segundo ejemplo, estamos comprobando si al menos una de las variables "esVerdadero" y "esFalso" es verdadera, lo que devuelve "true" ya que "esVerdadero" es verdadero.

## Operador lógico NOT (!)
El operador lógico NOT se utiliza para negar una expresión. Este operador se representa por el símbolo de exclamación "!".

La sintaxis básica del operador lógico NOT es la siguiente:

```java
!expresión
```

Donde "expresión" es la expresión que queremos negar.

Aquí hay algunos ejemplos de cómo se puede utilizar el operador lógico NOT:

```java
boolean esVerdadero = true;
boolean esFalso = !esVerdadero; // devuelve false

int numero = 10;
boolean noEsMenorQueCero = !(numero < 0); // devuelve true
```

En el primer ejemplo, estamos negando la variable "esVerdadero" usando el operador lógico NOT, lo que devuelve "false" ya que "esVerdadero" es verdadero. En el segundo ejemplo, estamos negando la expresión "numero < 0" usando el operador lógico NOT, lo que devuelve "true" ya que "numero" no es menor que cero.

## Precedencia de operadores
Es importante tener en cuenta que los operadores lógicos tienen una precedencia establecida en Java. Esto significa que algunas operaciones se evalúan antes que otras. La precedencia de los operadores lógicos en Java es la siguiente (de mayor a menor precedencia):

- Operador NOT (!)
- Operador AND (&&)
- Operador OR (||)

Siempre es recomendable utilizar paréntesis para agrupar las expresiones que se deben evaluar primero y evitar problemas de precedencia.
