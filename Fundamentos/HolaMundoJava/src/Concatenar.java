
import java.util.Scanner;

//Concatenar

public class Concatenar {
    public static void main(String args[]){
        var usuario = "Juan";
        var tituo = "Ingeniero";
        var union = tituo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        var suma = i + j;
        System.out.println("Si sumamos " + i + " más " + j + " la solución es " + suma);
        System.out.println(i + j);
        System.out.println(usuario + i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + (i + j));
        
     
        
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
