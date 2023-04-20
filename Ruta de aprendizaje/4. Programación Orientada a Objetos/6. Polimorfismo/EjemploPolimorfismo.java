package Polimorfismo;

/**
 * Programación Orientada a Objetos. Polimorfismo
 * @author TitoDev
 */

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        
        miAnimal.hacerSonido();
        miPerro.hacerSonido();
        miGato.hacerSonido();
    }
}
