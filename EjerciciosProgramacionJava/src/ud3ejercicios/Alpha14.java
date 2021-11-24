/*
 * Proyecto Ud3EjerciciosBucles - Archivo Alpha14.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;
import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 21:10:53
 */
public class Alpha14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Variables
        int numero;
        boolean algunMult10 = false;

        // Creo el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos 5 números
        for (int i = 1; i <= 5; i++) {
            
            // Pedimos número
            System.out.print("Dime un numero: ");
            numero = in.nextInt();
            
            // Si es par, ponemos interruptor a true
            if ((numero % 10) == 0) {
                algunMult10 = true;
            }
        }

        // Mostramos si alguno era múltiplo
        if (algunMult10)
            System.out.println("Alguno era múltiplo de 10");
        else
            System.out.println("Ninguno era múltiplo de 10");
    }

}
