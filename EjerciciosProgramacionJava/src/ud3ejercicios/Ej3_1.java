
package ud3ejercicios;

import java.util.Scanner;


public class Ej3_1 {

    
    public static void main(String[] args) {
         int a, b;
        
        Scanner entrada = new Scanner(System.in);
            
       
         
        
        System.out.println("Introduce un número");
        a = entrada.nextInt();
        System.out.println("Introduce otro número");
        b = entrada.nextInt();
        
        for (int i = a; i <=b; i+=2){
            System.out.println(i);
            
        }
        
    }
    
}
