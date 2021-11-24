/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej1.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;
import java.util.Scanner;
/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 20:15:21
 */
public class Ej1 {

    /**Escribe un programa que muestre la tabla de multiplicar del 
     * número que indique el usuario.
     */
    public static void main(String[] args) {
       int num;
        
        
        
        
        Scanner entrada=new Scanner(System.in);
      // Pedimos número
       System.out.println("Introduce un número");
       num = entrada.nextInt();
        
        for (int i = 1; i <= 10; i++) {
           
            
                System.out.println(num+" * "+i+" = "+(i*num));
                
        }       
            
           
            
            
        
        
       
    }

}
