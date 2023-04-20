package Herencia;

/**
 * Programación Orientada a Objetos. Herencia
 * @author TitoDev
 */

public class EjemploHerencia {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Ford", "Mustang", 2);
        System.out.println(coche1.getMarca() + " " + coche1.getModelo() + " tiene " + coche1.getNumPuertas() + " puertas.");
    }
}
