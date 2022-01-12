/*
 * Proyecto EjerciciosProgramacionJava - Archivo ProgramaPunto.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Ud6.Ejercicios1.Punto;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:02:23
 */
public class ProgramaPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto p1 = new Punto(5, 0);

        

        Punto p2 = new Punto(10, 10);
        

        Punto p3 = new Punto(-3, 7);
        

        System.out.println("P1 X:" + p1.x+", "+"Y:"+p1.y);
        System.out.println("P2 X:" + p2.x+", "+"Y:"+p2.y);
        System.out.println("P3 X:" + p3.x+", "+"Y:"+p3.y);
    }

}
