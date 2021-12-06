/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4ejerciciosvectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej19 {
    public static void main(String[] args) {
        // Variables
        int [] ranking = new int [8];
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        
        // Pido datos y relleno Array
        for (int i = 0; i < ranking.length; i++) {
            System.out.println("Introduce puntuación "+i+": ");
            ranking[i] = sc.nextInt();
        }
        // Ordeno Array de menos a más
        Arrays.sort(ranking);
        
        // Imprimo el array de forma descendente de más a menos
        for (int i = 7; i >= 0; i--) {
            System.out.println(i+": "+ranking[i]);
        }
    }
}
