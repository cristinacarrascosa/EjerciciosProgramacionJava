
package Ud7.POO.Excepciones.EjerciciosA;

import java.util.*;


public class Ej11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n =(int)(Math.random()*(100-1+1)+1);
        int [] vector = new int [n];
        int pos=0;
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random()*(10-1+1)+1);
        }
        
        do {            
            try {
                           
                System.out.println("¿Qué posición imprimo?");
                pos = sc.nextInt();
                
                    System.out.println(vector[pos]);
                
           
            
        } 
        catch (InputMismatchException e) {
            System.out.println("Valor incorrecto");
            sc.nextLine();
        }
        catch (IndexOutOfBoundsException i){
            System.out.println("El array es más corto");
            
        }
        } while (pos >=0);
        System.out.println("Programa finalizado");
       
    }
}
