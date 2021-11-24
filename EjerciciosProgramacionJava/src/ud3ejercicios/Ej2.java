/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej2.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 20:45:19
 */
public class Ej2 {

    /**Escribe un programa que calcule y muestre la suma y el producto 
     * (multiplicación) de los 10 primeros números naturales.
     */
    public static void main(String[] args) {
        
        for (int i=1;i<=10;i++) {
            //System.out.println(i);
            for (int j = 1; j < 10; j++) {
                System.out.println(i+ " + "+j+" = "+(i+j));
                System.out.println(i+" x "+j+ " = "+(i*j));
                
            }
        }
        
        
    }

}
