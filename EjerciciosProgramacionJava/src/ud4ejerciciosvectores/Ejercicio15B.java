/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4ejerciciosvectores;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author carra
 */
public class Ejercicio15B {
    public static void main(String[] args) {
        // Variables
        int[] numeros;
        int n,m;
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        
        // Pido n y m
        System.out.print("Dime N: ");
        n = sc.nextInt();
        System.out.print("Dime M:");
        m = sc.nextInt();
        
        // Creo Array de n tamaño
        numeros = new int [n];
        
        // Lleno array con fill
        Arrays.fill(numeros, m);
        
        // Muestro Array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i+": "+numeros[i]);
            
        }
    }
    
}
