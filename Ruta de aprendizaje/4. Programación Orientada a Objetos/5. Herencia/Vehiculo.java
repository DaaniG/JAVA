package Herencia;

/**
 * Programación Orientada a Objetos. Herencia
 * @author TitoDev
 */

public class Vehiculo {
    private String marca;
    private String modelo;
 
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public String getModelo() {
        return modelo;
    }
}
