![anotaciones](https://user-images.githubusercontent.com/75398496/233711613-698ee2c6-6113-438c-b028-c3969cc67222.png)

# Anotaciones (annotations) en Java
Las anotaciones (o annotations en inglés) son una herramienta de Java que permite agregar metadatos a los elementos de un programa, como clases, métodos o variables. Las anotaciones se representan mediante la sintaxis @nombre_de_la_anotación y pueden contener elementos con valores que se especifican entre paréntesis.

Java incluye algunas anotaciones predefinidas, como @Override, que indica que un método sobrescribe a otro método de la superclase, o @Deprecated, que indica que un elemento está obsoleto y se eliminará en versiones futuras. Además, es posible definir anotaciones personalizadas mediante la creación de interfaces que se anotan con @interface.

Un ejemplo de anotación personalizada es la siguiente:

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Autor {
    String nombre();
    String fecha();
    String comentario() default "";
}
```

En este ejemplo, se define una anotación llamada Autor que tiene tres elementos de tipo String: nombre, fecha y comentario. Además, la anotación se ha anotado con @Target y @Retention para especificar que solo se puede aplicar a métodos y que se retiene en tiempo de ejecución.

A continuación, se muestra cómo se puede utilizar esta anotación en un método:

```java
public class Ejemplo {

    @Autor(nombre = "Juan", fecha = "20/04/2023")
    public void metodoEjemplo() {
        // Código del método
    }
    
}
```

En este ejemplo, se aplica la anotación Autor al método metodoEjemplo, especificando el nombre del autor y la fecha de creación. El comentario es opcional y se omite en este caso.

Las anotaciones pueden ser procesadas por herramientas externas, como generadores de código o herramientas de análisis estático, para realizar tareas automatizadas o mejorar la calidad del código. Por ejemplo, una herramienta de análisis estático puede utilizar la anotación @SuppressWarnings para indicar que un código que genera una advertencia específica es intencional y no necesita ser corregido.
