package Interfaces;

/**
 * Programación Orientada a Objetos. Interfaces
 * @author TitoDev
 */

public class EjemploInterfaz {
    public static void main(String[] args) {
        Dibujable rectangulo = new Rectangulo(10, 10, 100, 50);
        rectangulo.dibujar();
        rectangulo.borrar();
    }
}
