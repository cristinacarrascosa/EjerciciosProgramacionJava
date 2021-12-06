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
public class Ej20 {
    public static void main(String[] args) {
        // Variables
        int[] num = new int [1000];
        int n;
        
        // creo Scanner
        Scanner sc = new Scanner(System.in);
        // PIdo n
        System.out.print("Introduce N: ");
        n = sc.nextInt();
        
        // Relleno Array
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*100);
        }
        // Ordeno Array
        Arrays.sort(num);
        // busco en el Array
        System.out.println("El dato "+n+" está en la posción: "+Arrays.binarySearch(num, n));
    }
}
