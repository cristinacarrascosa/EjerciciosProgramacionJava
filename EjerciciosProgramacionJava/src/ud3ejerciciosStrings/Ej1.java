/*
 * Proyecto Unidad4 - Archivo Ej1.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:26:01
 */
public class Ej1 {

    /**Crea un programa que pida una cadena de texto y luego la muestre tanto en
      *mayúsculas como en minúsculas.
     */
    public static void main(String[] args) {
        
 
        
        Scanner sc= new Scanner(System.in);
            
            System.out.println("Introduce un texto");
            String s = sc.nextLine();
            
            System.out.println(s.toUpperCase());
            System.out.println(s.toLowerCase());
            
        
    }

}
