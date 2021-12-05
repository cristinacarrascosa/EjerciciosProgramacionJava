/*
 * Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej3 {
    
        public static void main(String[] args) {
        
            int [] vec = new int[10];
            
            Scanner sc = new Scanner(System.in);
            
            //Pedimos valores
            for (int i = 0; i < 10; i++) {
                System.out.print("Introduce un número");
                vec [i]= sc.nextInt();
                
            }
            
            double maximo = vec[0];
            for (double element : vec) {
                if (element > maximo)
                    maximo = element;
            }
            
            System.out.println(maximo);
    }
    
}
