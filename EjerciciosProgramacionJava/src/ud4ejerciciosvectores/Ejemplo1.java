/*
 * Escribir en un vector y despues leerlo
 * vector o array
 * 
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejemplo1 {
     
    public static void main(String[] args) {
        
        int[] vec = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.print("Introduce un número entero: ");
            vec [i] = sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print(vec[i]+", ");
        }
    }
}
