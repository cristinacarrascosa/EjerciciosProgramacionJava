

package ud3ejercicios;
import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        
        int a; 
        boolean mult = false;
        
        Scanner sc=new Scanner(System.in);
       
        for (int i = 1; i <=5; i++) {
             System.out.println("Introduce un número");
             a = sc.nextInt();
        
                                   
                    if ((a % 10) == 0) {
                         mult = true;            
                    }    
            }
            if (mult 10) 
                System.out.println("Alguno era múltiplo");
             else
                System.out.println("Ninguno era múltiplo");
    }
 }

