/*
 * Proyecto EjerciciosProgramacionJava - Archivo Rectangulo.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ud6.Ejercicios1.Rectangulo;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:55:01
 */
public class Rectangulo {

    public int x1;
    public int y1;
    public int x2;
    public int y2;
    
   public Rectangulo(int x1, int y1, int x2, int y2){
       
       this.x1 = x1;
       this.y1 = y1;
       
       this.x2 = x2;
       this.y2 = y2;
       
       if((x2 > x1) && (y2 > y1)){
       x1 = x1;
       x2 = x2;
       y1 = y1;
       y2 = y2;
       
   }else System.err.println("Valores no válidos");
   }
    
}
