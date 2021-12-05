/*
 * Proyecto Unidad4 - Archivo Ej10.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:59:15
 */
public class Ej10 {

    /**
     * .Crea un programa que pida una cadena de texto y luego muestre sus palabras una a
     * una en líneas separadas. Por ejemplo, dada la cadena de texto “Hola, ¿qué tal
     * estás?” mostrará por pantalla:
        Hola,
        ¿qué
        tal
        estás?
     */
    
    public static void main(String[] args) {
        
        
        // creamos Scanner
        Scanner sc = new Scanner(System.in);
        
        //pedimos frase
        System.out.println("Introduce una cadena de texto");
        String f = sc.nextLine();
        
        //Recorremos los caracteres de f, mostrándolos uno a uno
        //si encontramos un espacio imprimimos nueva línea
        for (int i = 0; i < f.length(); i++) {
            char c = f.charAt(i);
            if ( c == ' ')
                System.out.println("");
            else
                System.out.print(c);
        }
       
    }

}
