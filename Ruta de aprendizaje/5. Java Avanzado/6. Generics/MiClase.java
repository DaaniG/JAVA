package Generics;

import java.util.List;

/**
 * Java Avanzado. Generics
 * @author TitoDev
 */

public class MiClase<T> {
    private T objeto;

    public MiClase(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    // Genéricos en métodos
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}

