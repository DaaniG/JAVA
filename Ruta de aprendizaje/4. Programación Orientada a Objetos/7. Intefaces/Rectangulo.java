package Interfaces;

/**
 * Programación Orientada a Objetos. Interfaces
 * @author TitoDev
 */

public class Rectangulo implements Dibujable {
    private int x;
    private int y;
    private int ancho;
    private int alto;

    public Rectangulo(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        // Código para dibujar un rectángulo en la pantalla
    }

    @Override
    public void borrar() {
        // Código para borrar un rectángulo de la pantalla
    }
}
