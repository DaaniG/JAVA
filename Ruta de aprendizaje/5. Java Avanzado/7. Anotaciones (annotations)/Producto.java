package Anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Java Avanzado. Anotaciones
 * @author TitoDev
 */

public class Producto {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Descuento {
        double valor();
        String motivo();
    }

    @Descuento(valor=0.2, motivo="Promoción de verano")
    private double precio;
    // Métodos getters y setters para precio
}
