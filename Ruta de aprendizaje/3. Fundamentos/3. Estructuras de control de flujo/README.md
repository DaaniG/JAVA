![23](https://user-images.githubusercontent.com/75398496/222225800-83a5fa0a-f524-4c31-af86-9bc65526141a.png)

Las estructuras de control de flujo son herramientas fundamentales en la programación, ya que nos permiten controlar el flujo de ejecución de nuestro programa y tomar decisiones en función de diferentes situaciones.

Existen varias estructuras de control de flujo en Java, como por ejemplo la estructura if-else, la estructura switch, la estructura for, la estructura while, la estructura do-while, la estructura break y la estructura continue.

## Estructura if-else:
Esta estructura permite ejecutar diferentes bloques de código dependiendo del resultado de una condición.
```java
int edad = 18;
if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```
## Estructura switch:
Esta estructura permite evaluar diferentes casos y ejecutar diferentes bloques de código en función del valor de una variable. 
```java
int diaSemana = 4;

switch (diaSemana) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    case 4:
        System.out.println("Jueves");
        break;
    case 5:
        System.out.println("Viernes");
        break;
    case 6:
        System.out.println("Sábado");
        break;
    case 7:
        System.out.println("Domingo");
        break;
    default:
        System.out.println("Valor inválido");
}
```

## Estructura for:
Esta estructura permite ejecutar un bloque de código varias veces, en función de una condición. 
```java
for (int i = 0; i < 10; i++) {
    System.out.println("Valor de i: " + i);
}
```

## Estructura while:
Esta estructura permite ejecutar un bloque de código mientras se cumpla una condición.
```java
int i = 0;
while (i < 10) {
    System.out.println("Valor de i: " + i);
    i++;
}
```

## Estructura do-while:
Esta estructura es similar a la estructura while, pero se ejecuta al menos una vez, independientemente de si se cumple o no la condición.
```java
int i = 0;
do {
    System.out.println("Valor de i: " + i);
    i++;
} while (i < 10);
```

## Estructura break:
Esta estructura permite salir de un bucle de manera anticipada.
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println("Valor de i: " + i);
}
```

## Estructura continue:
Esta estructura permite saltar a la siguiente iteración de un bucle.
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;
    }
    System.out.println("Valor de i: " + i);
}
```
