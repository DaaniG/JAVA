public class TiposPrimitivos {
    public static void main(String args[]){
        /*Tipos primitivos enteros:
            byte, short, int, long.
        */
        byte numeroByte = (byte)129;
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo byte: " + Byte.MAX_VALUE);
        System.out.println(numeroByte);
        
        short numeroShort = (short)123542350;
        
        System.out.println("numeroByte = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor máximo short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)123542350;
        
        System.out.println("numeroByte = " + numeroInt);
        System.out.println("valor minimo short: " + Integer.MIN_VALUE);
        System.out.println("valor máximo short: " + Integer.MAX_VALUE);
        
        long numeroLong = (long)1235423504934323423423423D;
        
        System.out.println("numeroByte = " + numeroLong);
        System.out.println("valor minimo short: " + Long.MIN_VALUE);
        System.out.println("valor máximo short: " + Long.MAX_VALUE);
        
        /*Tipos primitivos de tipo flotante:
            float, double
        */
        
        float numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo: " + Float.MIN_VALUE);
        System.out.println("Valor máximo: " + Float.MAX_VALUE);
        
        double numeroDouble = 10;
        System.out.println("numeroFloat = " + numeroDouble);
        System.out.println("Valor mínimo: " + Double.MIN_VALUE);
        System.out.println("Valor máximo: " + Double.MAX_VALUE);
        
    }
}
