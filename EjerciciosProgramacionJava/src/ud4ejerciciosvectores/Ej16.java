/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4ejerciciosvectores;

import java.util.Arrays;

/**
 *
 * @author carra
 */
public class Ej16 {
    public static void main(String[] args) {
        // Variables
        int[] numeros = new int [55];
        int aux = 0;// usamos aux para recorrer el vector
        
        // Para i desde 1 hasta 10
        for (int i = 1; i < 10; i++) {
            //insertamos i veces jel valor i
            // desde la posción aux hasta aux+i
            Arrays.fill(numeros,aux,aux+i, i);
            // Actualizamos aux
            aux +=i;
        }
        // Mostramos Array
        System.out.println(Arrays.toString(numeros));
    }
}
