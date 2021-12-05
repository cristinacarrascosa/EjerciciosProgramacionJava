/*
 * Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego muestre todos sus valores.
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej1 {
    
        public static void main(String[] args) {
        
            int[] vec = new int[10]; // le pongo el nombre al vector y el tamaño
            Scanner sc = new Scanner(System.in);// creo el objeto de tipo Scanner
            
            for (int i = 0; i < 10; i++) { // hay que tener en cuenta que el vector empieza en 0
                System.out.print("Introduce diez números: ");
                vec [i] = sc.nextInt();// guardo los valores en el vector
            }
            
            for (int i = 0; i < 10; i++) {//mostramos por pantalla cada uno de los valores
                System.out.print(vec[i]+", ");
                
            }
    }
    
}
