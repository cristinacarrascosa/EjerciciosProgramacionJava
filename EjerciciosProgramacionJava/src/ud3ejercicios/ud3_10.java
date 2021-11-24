package ud3ejercicios;

import java.util.Scanner;

public class ud3_10 {
    public static void main (String[] args) {
        /*Escribe un programa que pida introducir dos 
        números decimales y luego muestre el valor de su suma, 
        resta, producto y división. Se deberá evitar dividir 
        por cero.*/
        double a, b;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduce un número decimal");
        a = lector.nextDouble();
        System.out.println("Introduce otro número");
        b = lector.nextDouble();
        double s = a + b; 
        double r = a - b; 
        double p = a*b; 
        double di = a/b;
        
        
        if ( b == 0) {
            System.out.println( "La suma es "+ s + " la resta es " + r + " el producto es " + p + ". El resultado de la división es infinito");
        } else {
            System.out.println("La suma es "+ s + " la resta es " + r + " el producto es " + p + " la división es "+ di);
        }
        
    }
}