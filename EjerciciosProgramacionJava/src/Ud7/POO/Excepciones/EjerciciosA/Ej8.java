
package Ud7.POO.Excepciones.EjerciciosA;

import java.util.*;

public class Ej8 {
    
   
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        try {
             System.out.print("Introduce un número: ");
             num = sc.nextInt();
             System.out.println("En número introducido es: "+num);
             
        } 
        catch (InputMismatchException e) {
            
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
    
}
