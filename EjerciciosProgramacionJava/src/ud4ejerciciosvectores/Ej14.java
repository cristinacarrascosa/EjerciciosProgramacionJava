/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4ejerciciosvectores;

/**
 *
 * @author carra
 */
public class Ej14 {
     public static void main(String[] args) {
        
        // Variables
        int[] numeros = new int[55];
        int aux = 0; // Usaremos aux para recorrer el vector
        
        // Para i desde 1 hasta 10
        for (int i = 1; i <= 10; i++) {
            
            // Insertamos i veces el valor i
            for (int j = 1; j <= i; j++) {
                numeros[aux] = i;
                aux++;
            }
        }
        
        // Mostramos el vector
        System.out.print("Números:");
        for (int i = 0; i < 55; i++) {
            System.out.print(" " + numeros[i]);
        }
        
        // Salto de línea
        System.out.println("");
        
    }
    
}
