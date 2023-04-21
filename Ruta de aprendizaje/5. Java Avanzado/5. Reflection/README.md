![reflection](https://user-images.githubusercontent.com/75398496/233706133-18a9e146-5e2f-4154-9c1f-f562ef4903f2.png)

# Reflection en Java
Reflection es una característica de Java que permite a los programadores examinar y modificar la estructura, el comportamiento y los atributos de las clases y objetos en tiempo de ejecución. En otras palabras, la reflexión permite que un programa se examine a sí mismo y a su entorno en tiempo de ejecución.

La reflexión en Java se basa en la clase Class, que es una clase especial que representa la estructura de una clase en tiempo de ejecución. A través de la clase Class, los programadores pueden obtener información sobre una clase, como su nombre, los métodos que contiene, los atributos que tiene, las interfaces que implementa y los constructores que utiliza.

Además, la reflexión también permite a los programadores crear nuevas instancias de una clase, invocar sus métodos y modificar sus atributos. Esto se hace utilizando métodos como newInstance(), getDeclaredMethods(), getDeclaredFields(), setAccessible(), entre otros.

La reflexión es una herramienta poderosa y útil en el desarrollo de software, pero también es importante tener en cuenta que puede tener un impacto negativo en el rendimiento del programa y puede hacer que el código sea menos legible y mantenible si se usa de manera inadecuada.

Algunos casos de uso comunes de la reflexión en Java incluyen la creación de frameworks de inyección de dependencias, la manipulación de objetos a través de configuraciones de archivos, la creación dinámica de clases y la inspección de objetos en tiempo de ejecución.

Aquí tienes un ejemplo simple de cómo se utiliza la reflexión para obtener el nombre de una clase y sus métodos:

```java
Class<?> c = MyClass.class;
System.out.println("Nombre de la clase: " + c.getName());

// Obtener los campos de la clase
Field[] fields = c.getDeclaredFields();
for (Field field : fields) {
    System.out.println("Campo: " + field.getName() + ", Tipo: " + field.getType());
}

// Obtener los métodos de la clase
Method[] methods = c.getDeclaredMethods();
for (Method method : methods) {
    System.out.println("Método: " + method.getName() + ", Tipo de retorno: " + method.getReturnType());
}

// Crear una instancia de la clase
try {
    MyClass obj = (MyClass) c.newInstance();
} catch (InstantiationException | IllegalAccessException e) {
    e.printStackTrace();
}
```
En este ejemplo, se utiliza la clase MyClass como ejemplo de una clase que se examina mediante reflection. Se utiliza la clase Class para obtener información sobre la clase, incluyendo su nombre, campos y métodos. También se crea una nueva instancia de la clase utilizando el método newInstance().

Es importante tener en cuenta que el uso de reflection puede afectar el rendimiento y la seguridad de una aplicación, ya que permite acceder a partes del código que normalmente no están disponibles. Por lo tanto, se recomienda utilizar la reflection con precaución y solo cuando sea necesario.
