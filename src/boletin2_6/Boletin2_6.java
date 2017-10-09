
package boletin2_6;

import java.util.Scanner;

public class Boletin2_6 {

    public static void main(String[] args) {

        float precio, pagado;
        
        Scanner entradateclado= new Scanner (System.in);
        
        System.out.println("Introduzca precio de la prenda");
        precio= entradateclado.nextFloat();
        
        System.out.println("Introduzca precio pagado");
        
        pagado=entradateclado.nextFloat();
        
        System.out.println("Descuento realizado " + (100-(pagado*100/precio)));
        
    }
    
}
