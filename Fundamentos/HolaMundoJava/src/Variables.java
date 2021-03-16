//Mi clase en Java
public class Variables {
    public static void main(String args[]){
        //Definimos la varible
        int miVariableEntera = 2;
        System.out.println(miVariableEntera);
        //Modificamos la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Juan";
        System.out.println(miVariableCadena2 + " " + miVariableEntera2);
    }
}
