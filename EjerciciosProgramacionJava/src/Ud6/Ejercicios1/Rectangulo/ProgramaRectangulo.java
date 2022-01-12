/*
 * Proyecto EjerciciosProgramacionJava - Archivo ProgramaRectangulo.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ud6.Ejercicios1.Rectangulo;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:57:10
 */
public class ProgramaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
       
        
        Rectangulo r2 = new Rectangulo(7, 9, 2, 3);
       
        System.out.println("R1: "+r1.x1+", "+r1.y1+"  "+r1.x2+", "+r1.y2);
        System.out.println("Perímetro R1: "+(Math.abs(r1.x2-r1.x1)+Math.abs(r1.y2-r1.y1))*2);
        System.out.println("Área R1: "+Math.abs(r1.x2-r1.x1)*Math.abs(r1.y2-r1.y1));
        System.out.println("");
        System.out.println("R1: "+r2.x1+", "+r2.y1+"  "+r2.x2+", "+r2.y2);
        System.out.println("Perímetro 2: "+(Math.abs(r2.x2-r2.x1)+Math.abs(r2.y2-r2.y1))*2);
        System.out.println("Área R2: "+Math.abs(r2.x2-r2.x1)*Math.abs(r2.y2-r2.y1));
    }

}
