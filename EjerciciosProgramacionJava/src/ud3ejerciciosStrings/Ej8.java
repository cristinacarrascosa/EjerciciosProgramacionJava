/*
 * Proyecto Unidad4 - Archivo Ej8.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:46:36
 */
public class Ej8 {

    /**Crea un programa que pida al usuario introducir una  frase F  y una palabra P, y
muestre por pantalla cuántas veces aparece P en F.
     */
    public static void main(String[] args) {
            
        int posicion = 0,cont=0;
        
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Introduce una frase y una palabra");
                
                String f = sc.nextLine();
                String p = sc.nextLine();
                
                //bucle que busca todas las ocurrencias de P en F
                
                do {
                    // Busca p a partir de la posición 
                    posicion = f.indexOf(p,posicion);
                    
                    //Si lo has encontrado, actualizamos contador y posicion
                    if(posicion >= 0) {
                        cont++;
                        posicion++;
                    }
                } while (posicion != -1);
                 
                
                
                System.out.println(p+" aparece: "+cont+" veces");
        
    }

}
