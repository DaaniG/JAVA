package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Java Avanzado. Reflection
 * @author TitoDev
 */

public class EjemploReflection {

    public static void main(String[] args) {
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
    }
}
