/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej12.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ud3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 17:03:30
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a, b;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números");
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            //Mostramos solo si positivo
            if (i >=0) 
                System.out.println(i);
                
            
        }

    }

}
