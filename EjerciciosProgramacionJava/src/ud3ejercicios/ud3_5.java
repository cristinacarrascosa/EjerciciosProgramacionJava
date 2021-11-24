package ud3ejercicios;

import java.util.Scanner;

public class ud3_5 {
    
    public static void main (String[] args) {
        /*Escribe un programa que lee dos números y 
        los visualiza en orden ascendente*/
        int n1, n2;
        
        Scanner lector = new java.util.Scanner(System.in);
        
        System.out.println("Intorduce un número");
        n1 = lector.nextInt();
        
        System.out.println("Intorduce un número");
        n2 = lector.nextInt();
        
        if (n1 < n2) {
            System.out.println("Primero va el " + n1 + " y luego el "+n2);
        }
        else if (n1 > n2) {
            System.out.println("Primero va el " + n2 + " y luego el "+ n1);
        }
        else {
            System.out.println("Son iguales");
        }
        
        
    }
}