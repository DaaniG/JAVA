import java.util.Scanner;
//Ejemplo tienda de libros
public class TiendaLibros {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String name = String.valueOf(scanner.nextLine());
        
        System.out.println("Proporciona el id: ");
        int id = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Proporciona el precio: ");
        double price = Double.valueOf(scanner.nextLine());
        
        System.out.println("Proporciona el envio gratuito: ");
        boolean send = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("Proporciona el nombre: " + name);
        System.out.println("Proporciona el id: " + id);
        System.out.println("Proporciona el precio: " + price);
        System.out.println("Proporciona el envio gratuito: " + send);
    }
}
