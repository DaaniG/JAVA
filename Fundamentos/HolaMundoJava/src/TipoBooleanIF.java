//Tipo boolean con IF//
public class TipoBooleanIF {
    
    public static void main(String args[]){
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean == true){
            System.out.println("La bandera es verdadera ");
        }else{
            System.out.println("La bandera es falta");
        }
        
        var edad = 30;
        var esAdulto = edad >= 18;
        
        if(esAdulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
    }
    
}
