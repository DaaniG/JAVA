![generics](https://user-images.githubusercontent.com/75398496/233709360-3876e272-5400-4cdd-a306-05097dfee656.png)

# Generics en Java

En Java, los genéricos son una característica que permite la parametrización de tipos en clases, interfaces y métodos. La idea detrás de los genéricos es permitir que una clase o método pueda trabajar con diferentes tipos de datos de manera segura y sin necesidad de castear explícitamente.

En Java, la sintaxis para definir una clase o interfaz genérica es colocar el nombre del tipo de dato entre corchetes angulares <> después del nombre de la clase o interfaz. Por ejemplo, la siguiente es la definición de una clase genérica de tipo T:

```java
public class MiClase<T> {
   private T objeto;

   public MiClase(T objeto) {
      this.objeto = objeto;
   }

   public T getObjeto() {
      return objeto;
   }

   public void setObjeto(T objeto) {
      this.objeto = objeto;
   }
}
```

En este ejemplo, T es un parámetro de tipo que se utiliza para definir el tipo de objeto que se utilizará en la clase. Al crear una instancia de la clase, se debe especificar el tipo de dato que se usará para T.

El uso de genéricos permite escribir código que es más seguro en tiempo de compilación y más fácil de entender, ya que los tipos se verifican en tiempo de compilación en lugar de en tiempo de ejecución. Además, permite que el código sea más reutilizable, ya que se puede utilizar una sola clase o método para trabajar con diferentes tipos de datos.

Los genéricos también se pueden utilizar con métodos. Por ejemplo, la siguiente es la definición de un método genérico que imprime una lista de cualquier tipo de objeto:

```java
public static <T> void imprimirLista(List<T> lista) {
   for (T elemento : lista) {
      System.out.println(elemento);
   }
}
```

En este ejemplo, el parámetro de tipo T se utiliza para especificar el tipo de objeto que se va a imprimir. El método puede ser llamado con cualquier tipo de lista, siempre y cuando la lista sea de tipo List<T>.
