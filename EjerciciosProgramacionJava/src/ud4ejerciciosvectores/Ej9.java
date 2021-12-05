/*Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará en qué
posiciones del array aparece N. 
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej9 {
    
    public static void main(String[] args) {
        // Variables
        int [] numeros = new int [100];
        int n, pos = 0;
        boolean found = false;
        
        // Rellenamos con aleatorios la matriz
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*10)+1;
            
        }
       
        
        // Creamos el Scanner y pedimos N al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce N: ");
        n = sc.nextInt();
        
        // Mostramos las posiciones en las que aparece N
        System.out.println("Posiciones donde aparece "+n+":");
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] == n)
            System.out.println(i);
        }
          //Vemos el contenido de la matriz
        for (int numero : numeros) {
            System.out.print(numero+", ");
        }
    }   
    
}
