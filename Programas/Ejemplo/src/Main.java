import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Entrada

        System.out.print("Introduce el lado: ");  // Escribir
        Integer x = Integer.valueOf(scanner.next());  // Leer
        int resultado = x * x;  // Operación
        System.out.println("El area es: " + resultado); // Escribir
    }


    public static void calcularArea(Integer x){
        int resultado = x * x;  // Operación
        System.out.println("El area es: " + resultado);
    }
}