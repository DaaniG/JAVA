![paqmod](https://user-images.githubusercontent.com/75398496/233383256-fa421531-6a68-4c5e-8579-67f07943af23.png)

# Paquetes y módulos en Java:
En Java, los paquetes son utilizados para organizar y estructurar las clases y otros componentes de un programa. Un paquete es un conjunto de clases relacionadas que se agrupan juntas en una estructura de carpetas.

## Paquetes:
Los paquetes son útiles para evitar conflictos de nombres entre las clases, ya que cada paquete tiene su propio espacio de nombres. Además, los paquetes pueden ser utilizados para controlar el acceso a las clases y otros componentes, utilizando los modificadores de acceso "public", "protected" y "private".

Para definir una clase dentro de un paquete, se debe incluir la siguiente línea al principio del archivo de la clase:

```java
package nombrePaquete;
```
Donde "nombrePaquete" es el nombre del paquete en el que se desea incluir la clase. Por ejemplo, si se desea incluir una clase llamada "MiClase" en un paquete llamado "miPaquete", se debe incluir la siguiente línea al principio del archivo de la clase "MiClase.java":

```java
package miPaquete;
```
Luego, para utilizar la clase desde otro archivo, se debe importar el paquete y la clase:

```java
import miPaquete.MiClase;
```

## Módulos:
A partir de Java 9, se introdujeron los módulos como una forma de organizar y estructurar las clases y otros componentes de un programa de una manera más modular y segura. Los módulos son similares a los paquetes, pero proporcionan una forma más explícita de controlar el acceso a los componentes.

Un módulo es un conjunto de paquetes que se agrupan juntos y se encapsulan para protegerlos de cambios externos. Un módulo puede especificar qué paquetes son accesibles y qué paquetes no lo son, utilizando las palabras clave "exports" y "requires" respectivamente.

Para definir un módulo, se debe crear un archivo llamado "module-info.java" en el directorio raíz del módulo. Este archivo debe contener la siguiente información:

```java
module nombreModulo {
   requires moduloRequerido;
   exports nombrePaquete;
}
```

Donde "nombreModulo" es el nombre del módulo, "moduloRequerido" es el nombre de otro módulo que se requiere para ejecutar el actual, y "nombrePaquete" es el nombre del paquete que se exporta para ser utilizado por otros módulos.

Luego, para utilizar los componentes de un módulo desde otro módulo, se debe agregar el módulo requerido en el archivo "module-info.java" del módulo que desea utilizarlo:

```java
module miModulo {
   requires moduloRequerido;
   exports miPaquete;
}
```

Y se debe agregar el módulo actual como un módulo requerido en el archivo "module-info.java" del módulo que desea utilizarlo:

```java
module otroModulo {
   requires miModulo;
   // ...
}
```
