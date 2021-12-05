/*
 * Calcula la media de los elementos de un vector
 * pedimos tamaño y elementos del vector
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ejemplo2 {
    
    public static void main(String[] args) {
        
        int num;// esta variable entera va a ser la longitud del vector
        
        Scanner sc = new Scanner(System.in); //creo Scanner
        
        // pido la longitud del vector
        System.out.print("Introduce la longitud del vector: ");
        num = sc.nextInt(); //almaceno la longitud del vector
        
        //Declaro el vector de tipo double y le digo que tendra la longitud que he pedido en num
        
        double[] vec = new double[num];
        double total = 0; // declaro esta variable para almecenar la media
        
        // Ahora vamos a meter elementos en el vector
        for (int i = 0; i < num; i++) {
            System.out.print("Introduce valores al vector: ");
            vec[i] = sc.nextDouble(); // guardamos los valores
        }
        
        
       
        // hacemos un bucle for para recorrer cada uno de los elementos
        for (int i = 0; i < num; i++) {
            total += vec[i]; //sumamos cada uno de los elementos del vector a total
        }
        
         // Calculamos la media
         total /= num; //total = total / num
         
         //Imprimo la media
         System.out.println("La media es: "+total);
        
    }
            
    
}
