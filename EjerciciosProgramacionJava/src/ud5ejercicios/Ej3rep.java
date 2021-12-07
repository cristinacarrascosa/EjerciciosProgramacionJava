/*
 * Escribe un programa que pida dos números enteros por teclado y muestre por pantalla
cual es el mínimo. Implementa y utiliza la función:
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej3rep {
    public static int minimo(int a, int b){
        return Math.min(a, b);
    }
    public static void main(String[] args) {
        // Variables
        int num1,num2;
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // Pido números
        System.out.print("Introduce un número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2 = sc.nextInt();
        
        // Llamo a la función
        System.out.println("Es el menor: "+minimo(num1, num2));
    }
}
