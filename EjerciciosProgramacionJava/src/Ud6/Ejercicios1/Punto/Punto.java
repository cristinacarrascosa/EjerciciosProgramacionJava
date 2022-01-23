/*
 * Proyecto EjerciciosProgramacionJava - Archivo Punto.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ud6.Ejercicios1.Punto;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:01:57
 */
public class Punto {
    
     private int x;
     private int y;
     
     public Punto(int x, int y){
         
         this.x = x;
         this.y = y;
     }
     public int getX(){
         return x;
     }
     public int getY(){
         return y;
     }
     
     public void setX(int x){
         this.x = x;
     }
     public void setY(int y){
         this.y = y;
     }
     
     // Métodos  D1
     public void imprime(){
         System.out.println("("+x+", "+y+")");
     }
     public void setXY(int x, int y) {
         setX(x);
         setY(y);
     }
     public void desplaza(int dx, int dy) {
         setX(x + dx);
         setY(y + dy);
     }
     public int distancia(Punto p){
         int distancia = (int)Math.sqrt((p.x - this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
         return distancia;
     }
     public static String creaPuntoAleatorio(){
         int x = (int)(1+Math.random())*(100-99);
         int y = (int)(1+Math.random())*(100-99);
         return x+":"+y;
     }
}
