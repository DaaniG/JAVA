package LambdasFunciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Java Avanzado. Lambdas y funciones
 * @author TitoDev
 */

public class EjemploLambdas {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "Pedro", "Ana", "Luis");
        Collections.sort(nombres, (s1, s2) -> s1.compareTo(s2));
        System.out.println(nombres); // Imprime [Ana, Juan, Luis, Pedro]

        Suma suma = (a, b) -> a + b;
        int resultado = suma.sumar(3, 5);
        System.out.println(resultado); // Imprime 8
    }
}
