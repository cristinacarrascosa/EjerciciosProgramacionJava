/*
 * Proyecto Ud3EjerciciosBucles - Archivo Alpha15.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 20:11:27
 */
public class Alpha15 {

    public static void main(String[] args) {

        // Variables
        int numero;
        boolean algunNegativo = false;
        boolean algunMayor99  = false;

        // Creo el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos 5 números
        for (int i = 1; i <= 5; i++) {
            
            // Pedimos número
            System.out.print("Dime un numero: ");
            numero = in.nextInt();
            
            // Si es negativo, ponemos interruptor a true
            if ((numero % 2) == 0) {
                algunNegativo = true;
            }
            
            // Si es mayor que 99, ponemos interruptor a true
            if (numero > 99) {
                algunMayor99 = true;
            }
        }

        // Mostramos si alguno era negativo
        if (algunNegativo)
            System.out.println("Alguno era negativo");
        else
            System.out.println("Ninguno era negativo");
        
        // Mostramos si alguno era mayor que 99
        if (algunMayor99)
            System.out.println("Alguno era mayor que 99");
        else
            System.out.println("Ninguno era mayor que 99");
    }
}