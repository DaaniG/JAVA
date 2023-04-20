package Encapsulacion;

/**
 * Programación Orientada a Objetos. Encapsulación
 * @author TitoDev
 */

public class EjemploEncapsulacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        persona1.setEdad(30);
        System.out.println(persona1.getNombre() + " ahora tiene " + persona1.getEdad() + " años.");
    }
}
