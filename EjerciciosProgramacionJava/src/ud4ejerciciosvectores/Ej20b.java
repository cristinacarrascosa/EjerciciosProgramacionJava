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
public class Ej20b {
    public static void main(String[] args) {
        
        // Variables
        int[] numeros = new int[1000];
        int n, pos, cuantas = 0;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Rellenamos el vector con números aleatorios
        for (int i = 0; i < 1000; i++) {
            numeros[i] = (int)(Math.random() * 100);
        }
        
        // Pedimos el valor a buscar
        System.out.print("Dime el valor a buscar: ");
        n = in.nextInt();
        
        // Ordenamos el array. Es necesario para que funcione Arrays.binarySearch()
        Arrays.sort(numeros);
        
        // Buscamos si aparece N (devuelve la posición)
        pos = Arrays.binarySearch(numeros, n);

        // Si ha encontrado N
        if (pos != -1)        
            // Contamos cuantas veces aparece N
            for (int i = 0; i < 1000; i++) {
                if (numeros[i] == n)
                    cuantas++;
            }
        
        // Mostramos las veces que aparece
        System.out.println("Veces que aparece: " + cuantas);
    
    }    
}
    
