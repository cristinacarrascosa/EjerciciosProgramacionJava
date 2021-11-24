/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej7.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;
import java.util.Scanner;
/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:40:48
 */
public class Ej7 {

  
    public static void main(String[] args) {
        
          int a,b;
          int x=0;
         
          
          Scanner entrada=new Scanner(System.in);
          
          System.out.println("introduce dos números");
          a = entrada.nextInt();
          b = entrada.nextInt();
          x=a;
           for (int i=(a-1);i>=b;i--) {
            System.out.print(x+"+"+i+"=");
            x+=i;
            System.out.print(x+"\n");
        }
    }

}
