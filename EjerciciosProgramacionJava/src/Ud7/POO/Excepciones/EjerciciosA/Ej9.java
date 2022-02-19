        
package Ud7.POO.Excepciones.EjerciciosA;
 
import java.util.*;

public class Ej9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int res, a= 0, b=0;
        
        
        try {
            System.out.println("Introduce A y B");
            a=sc.nextInt();
            b=sc.nextInt();
            res = a/b;
            System.out.println("La división es: "+res);
        } 
        catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();
        }
        catch (ArithmeticException i){
            System.out.println("No se puede dividir entre 0");
            i.printStackTrace();
        }
        finally{
        System.out.println("Fin del programa");
        }
    }
    
}
