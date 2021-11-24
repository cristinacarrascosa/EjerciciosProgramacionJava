/*
 * Proyecto Ud3EjerciciosBucles - Archivo Depuracion.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package ud3ejercicios;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 16:13:02
 */
public class Depuracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int cont=1;
            int fin=1000;
            System.out.println("Incio cuenta ");
            while (cont<=fin) {
                System.out.println("Contador "+cont);
                cont++;
            }
            cont +=1;
            while (cont<=fin) {
                System.out.println("Contador "+cont);
                cont++;
            }
        // TODO code application logic here
    }

}
