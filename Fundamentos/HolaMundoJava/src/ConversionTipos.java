import java.util.Scanner;

//Conversión de Tipos//
public class ConversionTipos {
    public static void main(String args[]){
        //Convertir tipo String a un tipo int//
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
       
        var edad1 = "20";
        System.out.println("edad1 = " + (edad1 + 1)); //concatena en vez de sumar//
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporcione la edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
