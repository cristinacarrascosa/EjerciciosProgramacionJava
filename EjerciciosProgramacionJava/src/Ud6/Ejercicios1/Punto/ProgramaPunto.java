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
        punto p1 = new punto();

        p1.x = 5;
        p1.y = 0;

        punto p2 = new punto();
        p2.x = 10;
        p2.y = 10;

        punto p3 = new punto();
        p3.x = -3;
        p3.y = 7;

        System.out.println("P1 X:" + p1.x+", "+"Y:"+p1.y);
        System.out.println("P2 X:" + p2.x+", "+"Y:"+p2.y);
        System.out.println("P3 X:" + p3.x+", "+"Y:"+p3.y);
    }

}
