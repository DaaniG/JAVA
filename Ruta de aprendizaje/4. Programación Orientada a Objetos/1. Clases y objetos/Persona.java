package ClasesYObjetos;

/**
 * Programación Orientada a Objetos. Clases
 * @author TitoDev
 */

/* Creación de la clase Persona */
public class Persona {

    // Declaración de variables
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que retorna el nombre de la persona
    public String getNombre() {
        return this.nombre;
    }

    // Método que retorna la edad de la persona
    public int getEdad() {
        return this.edad;
    }

    // Método que imprime información de la persona
    public void imprimirInfo() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }
}
