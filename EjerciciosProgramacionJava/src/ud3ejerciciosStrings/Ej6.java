/*
 * Proyecto Unidad4 - Archivo Ej6.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:39:28
 */
public class Ej6 {

    /**Crea un programa que pida al usuario introducir una  frase F  y una palabra P, y
muestre por pantalla:
◦Si F contiene P.
◦Si F empieza por P.
◦Si F termina por P.
     */
    public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Introduce una frase");
                String frase = sc.nextLine();
                System.out.println("Introduce una palabra");
                String palabra = sc.nextLine();
                
                if (frase.startsWith(palabra)) {
                    System.out.println("la frase empieza por la palabra "+palabra);
                }
                else
                    System.out.println("la frase no empieza por "+palabra);
                
                if (frase.endsWith(palabra)) {
                    System.out.println("la frase acaba por: "+palabra);
                } 
                else
                    System.out.println("la frse no acaba por: "+palabra);
                
                if (frase.indexOf(palabra) !=-1){
                    System.out.println("contiene "+palabra);
                }
                else
                    System.out.println("la frase con contiene: "+palabra);
                
    }

}
