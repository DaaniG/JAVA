package Threads;

/**
 * Java Avanzado. Threads
 * @author TitoDev
 */

public class MiHilo extends Thread {

    public void run() {
        try {
            Thread.sleep(1000); // Pausa el hilo por 1 segundo
        } catch (InterruptedException e) {
            // Manejar la excepción
        }
    }
}
