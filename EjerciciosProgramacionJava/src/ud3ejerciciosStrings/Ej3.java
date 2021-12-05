/*
 * Proyecto Unidad4 - Archivo Ej3.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 18:31:36
 */
public class Ej3 {

    /**Crea un programa que pida dos cadenas de texto y luego 
     * las muestre en orden
        alfabético (sin diferenciar entre mayúsculas y minúsculas).
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce dos cadenas de texto");
        String t1=sc.nextLine();
        String t2=sc.nextLine();
        
        if (t1.compareToIgnoreCase(t2) == 1) {
            System.out.println("1º: "+t1+"\n2º:  "+t2);
        } else if (t1.compareToIgnoreCase(t2)== 0) {
            System.out.println("Son iguales");
        } else
            System.out.println("1º: "+t2+"\n2º: "+t1);
        
        
        
    }

}
