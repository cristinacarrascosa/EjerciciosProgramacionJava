/*
 *6.Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene
con valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array
con valores aleatorios.
 */
package ud5ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej16 {
    public static void rellenaRandom(double [] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
    }
    public static void main(String[] args) {
        // Variables
        double [] vec;
        int n;
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tamaño vector: ");
        n = sc.nextInt();
        
        vec = new double[n];
        
        rellenaRandom(vec);
        
        // Imprimimos vector
        System.out.println(Arrays.toString(vec));
    }
}
