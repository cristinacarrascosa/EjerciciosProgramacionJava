/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej9.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;
import java.util.Scanner;
/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:17:00
 */
public class Ej9 {

   
    public static void main(String[] args) {
       int a, b;
       int x=1;
       
       Scanner entrada=new Scanner(System.in);
       
        System.out.println("Introduce dos números");
        a=entrada.nextInt();
        b=entrada.nextInt();
        
        for (int i=a;i<=b;i++) {
            a*=i;
            System.out.println(a);
        }
        
    }

}
