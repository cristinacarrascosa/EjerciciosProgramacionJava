/* Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y
1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
mostrará cuántos valores del array son igual o superiores a R.
 */
package ud4ejerciciosvectores;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej8 {
    
    public static void main(String[] args) {
        
        double [] numeros = new double[100];
        double r;
        int iguales =0, superiores= 0;
        
        // llenamos Array con valores aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros [i]= Math.random();
            
        }
        
        // Pedimos valor al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número real");
        r=sc.nextDouble();
        
        // Miramos cuantos valores son iguales o superiores a R
        for (double numero: numeros){
            if (Objects.equals(r, numeros)){
                iguales ++;
            } else if (numero < r)
                    superiores ++;
        }
            
        /* Mostramos los valores del Array
        for (double numero : numeros) {
        System.out.println(numero+", ");    
        }*/
        System.out.println("Números iguales a "+r+": "+iguales);
        System.out.println("Números superiores a "+r+": "+superiores);
        
        
    }
    
}
