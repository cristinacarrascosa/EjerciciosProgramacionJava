/*
 * Proyecto Unidad4 - Archivo Ej4.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 18:43:16
 */
public class Ej4 {

    /**Crea   un   programa   que   pida   por  teclado   tres  cadenas  de   texto:  nombre   y  dos
apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se
introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”
     */
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce nombre y apellidos");
            
            String nom= sc.nextLine();
            String ap1= sc.nextLine();
            String ap2= sc.nextLine();
            
            
            
            
            System.out.println((nom.substring(0,3)+ap1.substring(0,3)+ap2.substring(0,3)).toUpperCase());
    }

}
