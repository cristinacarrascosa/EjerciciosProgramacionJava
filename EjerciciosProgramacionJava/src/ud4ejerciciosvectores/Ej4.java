/*
 * Crea un programa que pida veinte números enteros por teclado, los almacene en un
array y luego muestre por separado la suma de todos los valores positivos y
negativos.
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej4 {
    
        public static void main(String[] args) {
        
            int [] vec = new int[20];
            int sumaPos = 0, sumaNeg = 0;
            
            Scanner sc = new Scanner(System.in);
            
            for (int i = 0; i < 20; i++) {
                System.out.print("Introduce número: ");
                vec [i] = sc.nextInt();
            }
            for (int i = 0; i < 20; i++) {
                if (vec[i] < 0) {
                    sumaNeg += vec[i];
                }else
                    sumaPos += vec[i];
                
            }
            System.out.println("La suma de los positivos es: "+sumaPos);
            System.out.println("La suma de los negativos es: "+sumaNeg);
    }
    
}
