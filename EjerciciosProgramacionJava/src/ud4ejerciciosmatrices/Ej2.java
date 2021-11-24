/*
 * Proyecto Unidad4 - Archivo Ej2.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud4ejerciciosmatrices;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:41:15
 */
public class Ej2 {

    /**Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
iguales o no, además de si son iguales sin diferenciar entre mayúsculas y minúsculas
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce  2 cadenas de texto");
        String t1=sc.nextLine();
        String t2=sc.nextLine();
        
        if (t1.equals(t2)) {
            System.out.println("Son iguales");
        } else if (t1.equalsIgnoreCase(t2)) {
            System.out.println("Son iguales ignorando las mayúnsculas y minúsculas");
        } else
            System.out.println("No son iguales");
        
        
        
        
    }

}
