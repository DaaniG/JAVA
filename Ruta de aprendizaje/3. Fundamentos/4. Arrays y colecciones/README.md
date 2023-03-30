![24](https://user-images.githubusercontent.com/75398496/222225900-ca0a5c05-1044-4d9a-969a-46a4e92c771f.png)

# Un array en Java:
Es una estructura de datos que se utiliza para almacenar una colección de elementos del mismo tipo. Los arrays tienen una longitud fija que se define al crearlos y se accede a sus elementos utilizando un índice numérico.

```java
int[] numeros = new int[5];
```

# Las colecciones en Java:
Son estructuras de datos dinámicas que se utilizan para almacenar elementos de diferentes tipos. Las colecciones son más flexibles que los arrays porque pueden crecer y reducir su tamaño dinámicamente durante la ejecución del programa.
```java
import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<String>();
nombres.add("Juan");
nombres.add("Pedro");
nombres.add("María");

for (String nombre : nombres) {
    System.out.println(nombre);
}
```
