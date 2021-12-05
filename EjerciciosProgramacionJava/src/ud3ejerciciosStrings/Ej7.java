/*
 * Proyecto Unidad4 - Archivo Ej7.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:11:54
 */
public class Ej7 {

    /**Crea un programa que pida al usuario introducir una frase F, una palabra P1 y otra
palabra P2. Luego, mostrará F sustituyendo todas las ocurrencias de P1 por P2.
     */
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce una frase, una palabra y otra palabra");
            String f= sc.nextLine();
            String p1= sc.nextLine();
            String p2= sc.nextLine();
            
             System.out.println(f.replaceAll(p1, p2));
            
            
            
            
    }

}
