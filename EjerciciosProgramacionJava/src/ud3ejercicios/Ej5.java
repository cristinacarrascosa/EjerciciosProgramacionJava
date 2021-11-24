/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej5.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:57:07
 */
import java.util.Scanner;

public class Ej5 {

    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce dos números");
        int a= entrada.nextInt();
        int b=entrada.nextInt();
        
        for (int i=a;i>=b;i-=2) {
            System.out.println(i);
        }
        
        
        
       
    }

}
