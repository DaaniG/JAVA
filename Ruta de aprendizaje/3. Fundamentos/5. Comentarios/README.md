![19](https://user-images.githubusercontent.com/75398496/222225973-9a5821d6-e61b-480f-a554-fb06aed6ea14.png)

# Los comentarios en Java:
Son texto que se incluye en el código fuente para explicar lo que hace el programa. Los comentarios no se ejecutan cuando se compila el código, por lo que no afectan al funcionamiento del programa.

Java admite tres tipos de comentarios:

- Comentarios de una sola línea: estos comentarios comienzan con // y se extienden hasta el final de la línea. Se utilizan para agregar comentarios breves y explicativos en el código.

- Comentarios de múltiples líneas: estos comentarios comienzan con /* y terminan con */. Se utilizan para agregar comentarios más largos y detallados en el código.

- Comentarios de documentación: estos comentarios comienzan con /** y terminan con */. Se utilizan para generar documentación del código. Los comentarios de documentación se pueden procesar con herramientas de documentación para generar una documentación detallada del código.

Ejemplo:

```java
// Este es un comentario de una sola línea

/*
Este es un comentario de varias líneas.
Puede ser muy útil para explicar partes complejas del código.
*/

/**
* Este es un comentario de documentación.
* Se utiliza para generar documentación del código.
*/

public class EjemploComentarios {
    public static void main(String[] args) {
        // Imprime un mensaje en la consola
        System.out.println("Hola, mundo!");
    }
}
```

En este ejemplo, se utilizan los tres tipos de comentarios para agregar información sobre el código. 
- El primer comentario es un comentario de una sola línea que explica brevemente lo que hace el programa. 
- El segundo comentario es un comentario de varias líneas que proporciona información adicional sobre el código. 
- El tercer comentario es un comentario de documentación que se utiliza para generar documentación del código.
