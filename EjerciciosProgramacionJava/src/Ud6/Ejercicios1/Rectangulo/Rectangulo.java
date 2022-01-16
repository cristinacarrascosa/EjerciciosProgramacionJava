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

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Constructor
    public Rectangulo(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;

        if ((x2 > x1) && (y2 > y1)) {
            x1 = x1;
            x2 = x2;
            y1 = y1;
            y2 = y2;

        } else {
            System.err.println("Valores no válidos");
        }

    }

    //Getters
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    
    // Setters
    public void setX1(int x1){
        this.x1 = x1;
    }
    public void setY1(int y1){
        this.y1 = y1;
    }
    public void setX2(int x2){
        this.x2 = x2;
    }
    public void setY2(int y2){
        this.y2 = y2;
    }
    
    //Métodos
    public void imprimir(){
        System.out.println("Rectángulo: ("+getX1()+","+getY1()+")("+getX2()+","+getY2()+")");
    }
    

}
