package ud3ejercicios;

import java.util.Scanner;

public class ud3_7 {
    public static void main (String[] args) {
        /*Escribe un programa que lea tres números 
        enteros y nos diga cuál es el mayor.*/
        
        int a, b, c;
        
        Scanner lector = new java.util.Scanner(System.in);
        System.out.println("Introduce un número");
        a = lector.nextInt();
        
        System.out.println("Introduce otro número");
        b = lector.nextInt();
        
        System.out.println("Introduce el último número");
        c = lector.nextInt();
        
        if (a > b && a > c) {
            System.out.print(a +" es el mayor.");
        } else if (b > a && b > c) {
            System.out.println(b +" es el mayor.");
        } else {
            System.out.println(c + " es el mayor.");
        }
        
        
    }
}    