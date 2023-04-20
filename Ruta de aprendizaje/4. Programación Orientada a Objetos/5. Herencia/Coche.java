package Herencia;

/**
 * Programación Orientada a Objetos. Herencia
 * @author TitoDev
 */

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}
