![threads](https://user-images.githubusercontent.com/75398496/233455432-021497d2-0556-44a0-8ef8-ca5972215793.png)

# Threads en Java
Los threads, también conocidos como hilos, en Java son unidades de ejecución separadas que pueden ser ejecutadas simultáneamente en un programa. Los threads permiten que un programa realice múltiples tareas al mismo tiempo, lo que puede mejorar el rendimiento y la eficiencia del programa.

En Java, se pueden crear threads utilizando la clase Thread. Para crear un thread, se debe extender la clase Thread y sobrescribir el método run(), que es el método que será ejecutado en el hilo.

```java
public class MiHilo extends Thread {
  public void run() {
    // Código a ejecutar en el hilo
  }
}
```

Una vez que se ha creado la clase de hilo, se puede instanciar y ejecutar el hilo utilizando el método start().

```java
MiHilo miHilo = new MiHilo();
miHilo.start();
```

También es posible crear un hilo utilizando la interfaz Runnable. En este caso, se debe implementar el método run() de la interfaz Runnable en una clase separada y luego pasar una instancia de esa clase al constructor Thread.

```java
public class MiRunnable implements Runnable {
  public void run() {
    // Código a ejecutar en el hilo
  }
}

MiRunnable miRunnable = new MiRunnable();
Thread miHilo = new Thread(miRunnable);
miHilo.start();
```

Además de crear hilos, es importante comprender cómo manejar y controlar los hilos en un programa. Los hilos pueden ser pausados, interrumpidos, y pueden ser utilizados para realizar tareas concurrentes.

Por ejemplo, se puede utilizar el método sleep() para pausar un hilo durante un período de tiempo determinado:

```java
public void run() {
  try {
    Thread.sleep(1000); // Pausa el hilo por 1 segundo
  } catch (InterruptedException e) {
    // Manejar la excepción
  }
}
```

También se puede utilizar el método join() para esperar a que un hilo termine su ejecución antes de continuar con el hilo principal:

```java
MiHilo miHilo = new MiHilo();
miHilo.start();
try {
  miHilo.join(); // Espera a que miHilo termine
} catch (InterruptedException e) {
  // Manejar la excepción
}
```
