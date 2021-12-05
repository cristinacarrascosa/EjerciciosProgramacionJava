/*
 * Crea un programa que pida al usuario introducir una cadena de texto con dos
 *palabras y luego muestre por pantalla las dos palabras en líneas distintas. Por
 *ejemplo, dada la cadena de texto “Hola Lionel” mostrará por pantalla:
 *hola
 *Lionel
 */
package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej9 {
    
        public static void main(String[] args) {
            int pos;
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce una cadena de texto con dos palabras");
            String f = sc.nextLine();
             
            // Buscamos la posición del espacio
            pos = f.indexOf(" ");
            
            // Mostramso subcadena desde 0 hasta pos
            System.out.println(f.substring(0, pos));

            // Mostramos subcadena desde pos+1 hasta el final
            System.out.println(f.substring( pos + 1, f.length()));
            
            
    }
    
}
