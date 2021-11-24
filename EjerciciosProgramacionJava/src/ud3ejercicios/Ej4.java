/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej4.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:49:15
 */
import java.util.Scanner;
public class Ej4 {

   
    public static void main(String[] args) {
        
        int a, b;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce dos números, el mayor primero");
        a = entrada.nextInt();
        b= entrada.nextInt();
        
        for (int i = b; i <=a; i++){
            System.out.println(i);
            
        }
        
                
    }

}
