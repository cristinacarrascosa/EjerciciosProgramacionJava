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
public class Ej17 {
    public static void main(String[] args) {
        // Variables
        int [] num1= new int [10];
        int [] num2= new int [10];
        boolean iguales;
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        
        // Llenamos el array 1 con un for
        for (int i = 0; i < num1.length; i++) {
            System.out.print("Introduce valor "+i+": ");
            num1[i]= sc.nextInt();
        }
        // LLenamos el array 2 con otro for
        for (int i = 0; i < num2.length; i++) {
            System.out.print("Introduce valor "+i+": ");
            num2 [i] = sc.nextInt();
        }
        // comprobamos si son iguales
        iguales = Arrays.equals(num1, num2);
        
        // Mostramos si son iguales
        if (iguales){
            System.out.println("Los Arrays son iguales");
        }else
            System.out.println("Los Arrays no son iguales");
    }
}
