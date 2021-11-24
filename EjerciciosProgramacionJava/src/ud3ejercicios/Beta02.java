/*
 * Proyecto Ud3EjerciciosBucles - Archivo Beta02.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 20:53:11
 */
public class Beta02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Variables
        int suma = 0, prod = 1;
        
        // Calculamos suma y producto de 1 a 10
        for (int i = 1; i <= 10; i++) {
            suma += i;
            prod *= i;
        }
        
        // Mostramos suma y producto
        System.out.println("Suma    : " + suma);
        System.out.println("Producto: " + prod);
        
    }

}
