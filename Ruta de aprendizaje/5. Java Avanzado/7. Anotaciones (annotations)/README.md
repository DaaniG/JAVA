![anotaciones](https://user-images.githubusercontent.com/75398496/233711613-698ee2c6-6113-438c-b028-c3969cc67222.png)

# Anotaciones (annotations) en Java
Las anotaciones son una característica poderosa de Java que permiten agregar metadatos a clases, métodos, variables y otros elementos del código fuente. Estos metadatos pueden ser utilizados por herramientas de compilación, bibliotecas y marcos de trabajo para generar código, realizar validaciones y ejecutar acciones adicionales durante el tiempo de compilación y ejecución.

Las anotaciones se definen utilizando la sintaxis @nombre_de_la_anotación y se colocan antes del elemento que se va a anotar. Por ejemplo, la anotación @Override se utiliza para indicar que un método sobrescribe un método de la superclase. Aquí hay un ejemplo:

```java
public class MiClase {
    @Override
    public void miMetodo() {
        // Código de la implementación del método
    }
}
```

Además de las anotaciones predefinidas en Java, los desarrolladores también pueden crear sus propias anotaciones personalizadas utilizando la palabra clave @interface. Las anotaciones personalizadas se pueden utilizar para agregar metadatos específicos de la aplicación a las clases y métodos.

Por ejemplo, supongamos que estamos creando una aplicación de comercio electrónico y queremos agregar un campo "descuento" a algunos de nuestros productos. Podríamos definir una anotación personalizada llamada @Descuento de la siguiente manera:

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Descuento {
    double valor();
    String motivo();
}
```

Esta anotación personalizada tiene dos atributos, valor y motivo, que se pueden utilizar para especificar el valor del descuento y la razón por la que se aplica el descuento. La anotación también tiene dos meta-anotaciones, Retention y Target, que especifican cómo y dónde se puede utilizar la anotación.

Para utilizar la anotación en una clase de producto, podemos hacer lo siguiente:

```java
public class Producto {
    @Descuento(valor=0.2, motivo="Promoción de verano")
    private double precio;
    // Métodos getters y setters para precio
}
```

En este ejemplo, hemos anotado el campo precio de la clase Producto con nuestra anotación personalizada @Descuento. Esto indica que el producto tiene un descuento del 20% y que la razón del descuento es una promoción de verano.

Las anotaciones son una característica poderosa de Java que pueden mejorar la legibilidad del código, permitir la generación de código y agregar metadatos específicos de la aplicación. Con un buen diseño, las anotaciones pueden mejorar significativamente la productividad y la calidad del software.
