package ud3ejercicios;

import java.util.Scanner;
public class ud3_9 {
    
    public static void main (String[] args) {
        /*Escribe un programa que pida dos números (A y B) y 
        muestre un mensaje por pantalla indicando si alguno de 
        ellos es múltiplo del otro.*/
        
        int a, b;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introduce un dígito");
        a = lector.nextInt();
        System.out.println("Introduce otro dígito");
        b = lector.nextInt();
        
        if ((a % b == 0) || (b % a == 0)) {
            System.out.println("Son múltiplos");
        } else {
            System.out.println("No son múltiplos");
        }
        
        
    }
}    