/*
 * Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego muestre la suma de todos los valores.
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej2 {
    
        public static void main(String[] args) {
        
            int [] vec = new int[10];
            int suma = 0;
            
            Scanner sc = new Scanner(System.in);
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Introduce diez números: ");
                vec [i] = sc.nextInt();
            }
            
            for (int i = 0; i < 10; i++){
                suma += vec[i];
            }
            System.out.println("La suma de los valores es: "+suma);
    }
    
}
