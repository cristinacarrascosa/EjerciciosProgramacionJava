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
        
        // Utilizamos los métodos creados en D1
        System.out.println("Utilización imprime");
        p1.imprime();
        System.out.println("Utilizo la modificación de coordenadas");
        p1.setXY(5, 2);
        p1.imprime();
        System.out.println("Utilizo el desplaza");
        p1.desplaza(3, 6);
        p1.imprime();
        
        
        System.out.println("distancia del punto p3 "+p1.distancia(p3));

       /* System.out.println("P1 X:" + p1.getX()+", "+"Y:"+p1.getY());
        System.out.println("P2 X:" + p2.getX()+", "+"Y:"+p2.getY());
        System.out.println("P3 X:" + p3.getX()+", "+"Y:"+p3.getY());*/
       
       
        
    }
    
    
    
    

}
