/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej13 {
    public static void main(String[] args) {
        // Variables
        int[]secuencia;
        int v,inc,n =0;
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        
        // Pido datos
        System.out.print("Introduce el número de valores a crear: ");
        n = sc.nextInt();
        secuencia = new int[n];
        System.out.print("Introduce un valor inicial:");
        v = sc.nextInt();
        System.out.println("Introduce el incremento: ");
        inc = sc.nextInt();
        
        
        // Llenamos Array
        for (int i = 0; i < n; i++) {
            secuencia [i] = v+ (inc*i);
        }
        // Motramos Array
        for (int i = 0; i < 10; i++) {
            System.out.println(i+": "+secuencia[i]);
        }
       
    }
    
}
