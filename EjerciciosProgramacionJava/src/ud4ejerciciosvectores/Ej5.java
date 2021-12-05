/*
 * Crea un programa que pida veinte números reales por teclado, los almacene en un
    array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
    valores.
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej5 {
    
        public static void main(String[] args) {
            //Variables
            double[] vec = new double[20];
            double media = 0; //aqui almacenaremos la media
            
            Scanner sc = new Scanner(System.in);
            
            for (int i = 0; i < 20; i++) {
                System.out.print("introduce un número: ");
                vec[i] = sc.nextDouble();
            }
            // recorremos los valores del array
            for (int i = 0; i < 20; i++) {
                media += vec[i];//sumamos los valores
            }
            // Calculamos la media
            media /= 20;
            //Muestro el total
            System.out.println("La media es: "+media);
    }
    
}
