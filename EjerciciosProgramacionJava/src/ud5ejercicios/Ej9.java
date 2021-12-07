/*
 * Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el
más elevado. Impleméntalo creando únicamente una función a la que le pasemos dos
valores (no tres) y nos devuelva el máximo de los dos valores.
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej9 {
    public static int masElevado (int a, int b){
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        // Variables
        int a, b, c, max;
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // Pido datos
        System.out.print("Valor 1: ");
        a = sc.nextInt();
        System.out.print("Valor 2: ");
        b = sc.nextInt();
        System.out.print("Valor 3: ");
        c = sc.nextInt();
        
        max = masElevado(a, b);
        max = masElevado(max,c);
        
        System.out.println("El máximo es: "+max);
    }
}
