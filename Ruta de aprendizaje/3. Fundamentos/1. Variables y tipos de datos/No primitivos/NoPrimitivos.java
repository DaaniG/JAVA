package VariablesYTiposDeDatos;

/**
 * Variables y tipos de datos: No primitivos
 * @author TitoDev
 */

public class NoPrimitivos {

    public static void main(String[] args) {

        /* String: es una secuencia de caracteres. A diferencia de los tipos primitivos, que son palabras clave del
        lenguaje, el tipo de datos String se define en la biblioteca estándar de Java. */
        String miString = "Hola mundo";

        /* Array: es una colección de elementos del mismo tipo de datos. */
        int[] miArray = {1, 2, 3, 4, 5};
    }

    /* Clase: una clase es un plano o modelo para crear objetos. Las clases son tipos de datos personalizados y se
    utilizan para definir objetos en Java. */
    public class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }

    /* Enumeraciones: una enumeración es un conjunto de valores constantes. Las enumeraciones se utilizan para definir
    un conjunto fijo de valores que se pueden asignar a una variable. */
    enum DiaSemana {
        LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
    }
    DiaSemana dia = DiaSemana.LUNES;

    /* Clases Wrapper: son clases que envuelven o encapsulan tipos de datos primitivos para permitirles comportarse
    como objetos. */
    Integer miInteger = new Integer(10);
}
