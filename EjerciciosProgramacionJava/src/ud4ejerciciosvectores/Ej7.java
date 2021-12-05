/*
 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que
    contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej7 {
    
        public static void main(String[] args) {
            
            // Variables
            int p, q, cuantos;
            int[] numeros;
            
                        
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Introduce P: ");
            p = sc.nextInt();
            System.out.print("Introduce Q: ");
            q = sc.nextInt();
            // calculamos cuantos valores hay desde p hasta q
            cuantos = q - p +1;
            
            // creamos el array cuantos
            numeros = new int[cuantos];
            
            // insertamos los valores desde p hasta q
            for (int i = 0; i < cuantos; i++) {
                numeros[i] = p + i;
                
            }
            /* mostramos el contenido del array
            for (int numero : numeros) {
                System.out.println("Numero: "+numero);
            }*/
            
            for (int i = 0; i < cuantos; i++) {
                System.out.println("Numero "+ i + ": "+ numeros[i]);
            }
            
            
            
            
    }
    
}
