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
public class Ej15 {
    public static void main(String[] args) {
        // Variables
        int[] numeros;
        int n, m;
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        
        // Pido N y M
        System.out.println("Introduce N(tamaño array): ");
        n =sc.nextInt();
        numeros = new int[n];
        System.out.println("Introduce M(Valor del array)");
        m = sc.nextInt();
        
        // Relleno el Array con M
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= m;
        }
        // Muestro Array
        for (int i = 0; i < 10; i++) {
            System.out.println(i+": "+numeros[i]);
        }
    }
}
