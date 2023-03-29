![expresiones](https://user-images.githubusercontent.com/75398496/228667716-a1c340b9-bb36-4aa6-9c9e-d1646f362bea.png)

En Java, las expresiones regulares se utilizan para buscar y manipular cadenas de caracteres. Los operadores de expresiones regulares se utilizan para construir patrones de búsqueda que se utilizan para comparar y manipular cadenas de caracteres. Los operadores de expresiones regulares disponibles en Java son los siguientes:

## . (punto): 
El operador de punto se utiliza para buscar cualquier carácter, excepto el carácter de nueva línea (\n).
```java
String cadena = "Hola Mundo";
boolean resultado = cadena.matches("H..a"); // El valor de resultado será true
```

## [] (corchetes): 
Los corchetes se utilizan para buscar un conjunto de caracteres.
```java
String cadena = "Hola Mundo";
boolean resultado = cadena.matches("[Hh]ola [Mm]undo"); // El valor de resultado será true
```

## ^ (circunflejo): 
El operador de circunflejo se utiliza para buscar una cadena que comience con un cierto patrón.
```java
String cadena = "Hola Mundo";
boolean resultado = cadena.matches("^H[a-z]*"); // El valor de resultado será true
```

## $ (signo de dólar): 
El operador de signo de dólar se utiliza para buscar una cadena que termine con un cierto patrón.
```java
String cadena = "Hola Mundo";
boolean resultado = cadena.matches(".*do$"); // El valor de resultado será true
```

## | (barra vertical): 
El operador de barra vertical se utiliza para buscar cualquiera de los patrones especificados.
```java
String cadena = "Hola Mundo";
boolean resultado = cadena.matches("Hola|Adiós"); // El valor de resultado será true si la cadena es "Hola" o "Adiós"
```

## () (paréntesis): 
Los paréntesis se utilizan para agrupar patrones juntos. 
```java
String cadena = "Hola Mundo";
boolean resultado = cadena.matches("(Hola|Adiós) Mundo"); // El valor de resultado será true si la cadena es "Hola Mundo" o "Adiós Mundo"
```
