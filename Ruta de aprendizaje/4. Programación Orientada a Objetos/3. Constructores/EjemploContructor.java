package Constructores;

/**
 * Programación Orientada a Objetos. Constructores
 * @author TitoDev
 */

public class EjemploContructor {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
    }
}
