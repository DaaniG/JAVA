package Threads;

/**
 * Java Avanzado. Threads
 * @author TitoDev
 */

public class Main {

    public static void main(String[] args) {
        MiHilo miHilo = new MiHilo();
        miHilo.start();

        try {
            miHilo.join(); // Espera a que miHilo termine
        } catch (InterruptedException e) {
            // Manejar la excepción
        }
    }
}
