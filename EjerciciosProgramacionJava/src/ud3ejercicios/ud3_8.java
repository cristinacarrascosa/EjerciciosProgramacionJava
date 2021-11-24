package ud3ejercicios;

import java.util.Scanner;

public class ud3_8 {
    public static void main (String[] args) {
        /*Escribe un programa que pida dos números (A y B) y 
        muestre un mensaje por pantalla indicando si A es mútiplo 
        de B.*/
        
        int a, b;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        a = lector.nextInt();
        System.out.println("Introduce otro número");
        b = lector.nextInt();
        
        if (a % b == 0) {
            System.out.println(a + " es múltiplo de " + b);
        } else if (b % a == 0) {
            System.out.println(b + " es múltiplo de " + a);
        } else {
            System.out.println(a + " y " + b + " no son múltiplos.");
        }
        
        
        
        
        
    }
    
        
        
}