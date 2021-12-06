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
public class Ej18 {
    public static void main(String[] args) {
        // Variables
        int [] num = new int [30];
        
        // Rellenamos Array
        for (int i = 0; i < num.length; i++) {
            num [i] = (int)(Math.random()*10);
        }
        
        // Ordenamos Array
        Arrays.sort(num);
        // Mostramos Array
        System.out.println(Arrays.toString(num));
    }
}
