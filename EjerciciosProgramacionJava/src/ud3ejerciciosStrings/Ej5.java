/*
 * Proyecto Unidad4 - Archivo Ej5.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:05:18
 */
public class Ej5 {

    /**Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me
mima” dirá que hay:
* ◦Nº de A: 3
◦Nº de E: 1
◦Nº de I: 2
◦Nº de O: 0
◦Nº de U: 0
     */
    public static void main(String[] args) {
             int vocalA=0,vocalE=0,vocalI=0,vocalO=0,vocalU=0;
                
             Scanner sc = new Scanner(System.in);
             
             System.out.println("Introduce frase");
             String frase = sc.nextLine();
             
              String fraseMayus= frase.toUpperCase();
              
              System.out.println(fraseMayus);
              
              for (int i = 0; i < fraseMayus.length(); i++) {
                  if (fraseMayus.charAt(i)=='A') {
                      vocalA++;
                  } else if (fraseMayus.charAt(i)== 'E') {
                    vocalE++;
                  } else if (fraseMayus.charAt(i)== 'I') {
                       vocalI++;
                  } else if (fraseMayus.charAt(i)== 'O') {
                      vocalO++;
                  } else if (fraseMayus.charAt(i)== 'U') {
                      vocalU++;
                  }
                    
              }
                 
               System.out.println("A: "+vocalA+"\nE: "+vocalE+"\nI: "+vocalI+"\nO: "+vocalO+"\nU: "+vocalU);
    }

}
