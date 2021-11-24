/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej11.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;
import java.util.Scanner;
/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 16:45:18
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double total=0 ;
      
            Scanner sc= new Scanner(System.in);
            
        for (int i=1;i<=5;i++) {
            System.out.println("Introduce el precio de 5 artículos");
                total+= sc.nextDouble();
            
        }
        System.out.println("Precio total "+total);
    }

}
