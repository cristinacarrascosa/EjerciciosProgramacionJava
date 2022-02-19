
package Ud7.POO.Excepciones.EjerciciosA;

import java.util.*;


public class Ej10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double [] num = new double[5];
        
        for (int i = 0; i < num.length; i++)
        try {
             
                System.out.println("introduce valor");
               num[i] = sc.nextDouble();
                
            
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Este valor no se puede introducir en el array. Vuelve a introducir el valor...");
            e.printStackTrace();
            sc.nextLine();
            i--;
        }
        
       
        mostrarVector(num);
    } 
    
    public static void mostrarVector(double [] v){
        System.out.print("Datos vector [ ");
        for (int j = 0; j < v.length; j++) 
        {
            System.out.print(v[j]+", ");
        }
        System.out.println("\b\b ]");
    }
       
}
        


