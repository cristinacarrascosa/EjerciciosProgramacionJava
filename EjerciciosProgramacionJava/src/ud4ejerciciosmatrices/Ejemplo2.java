/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4ejerciciosmatrices;

/**
 *
 * @author carra
 */
public class Ejemplo2 {
    public static void main(String[] args) {
         // como rellenar una matriz
        int [][] matrix = {
                {10,15,18,19,21},   
                {5,25,37,41,15},   
                {7,19,32,14,90},  
                {85,2,7,40,27}   
        };
        
       // Recorrer la matriz con un bucle for each
        for (int[] fila : matrix) {
            System.out.println("");
            
            for (int z : fila) {
                System.out.print(z+ " ");
                
            }
        }
    }
}
