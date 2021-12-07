/*
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
que cero, cuántos son menores que cero y cuántos son igual a cero.
 */
package ud4ejerciciosmatrices;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej3 {
    public static void main(String[] args) {
        // Variables
        int [][] numeros;
        int cuantosMayores= 0, cuantosMenos = 0, cuantosIguales = 0;
        int n, m;
        
        // Creamos Scanner
        Scanner sc = new Scanner(System.in);
        
        // Pedimos valores
        System.out.print("Introduce N: ");
        n = sc.nextInt();
        System.out.print("Introduce M: ");
        m = sc.nextInt();
        // Creamos matriz con los valores introducidos
        numeros = new int [n][m];
        
        // Pedimos valores para rellenar
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.println("Dime valor ["+i+"]["+j+"]");
                numeros[i][j]=sc.nextInt();
            }
        }
        // Mostramos matriz
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Fila "+i+": ");
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
