package ud3ejercicios;

import java.util.Scanner;

public class ud3_6 {
    
    public static void main (String[] args) {
        /*Escribe un programa que pida 2 números enteros y muestre el mayor. 
        Si son iguales,deberá mostrar el mensaje “Son iguales”*/
        int n1,n2;
        
        Scanner lector = new java.util.Scanner(System.in);
        
        System.out.println("Introduce un número");
        n1 = lector.nextInt();
        
        System.out.println("Introduce otro número");
        n2 = lector.nextInt();
        
        
        if (n1 == n2) {
            System.out.println("Los dos números son iguales");
        } else {
            System.out.println("El número mayor es " + Math.max(n1,n2));
        }

    }
}
