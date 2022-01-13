/*
 * Proyecto EjerciciosProgramacionJava - Archivo Articulo.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Ud6.Ejercicios1.Articulo;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 12 ene. 2022 17:22:54
 */
public class Articulo {

    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;
    
    
    // Constructor
    public Articulo(String nom, double p, int iva, int cuantosQ) {

        this.nombre = nom;
        if (p <= 0) {
            System.err.println("Precio no válido");
        } else {
            precio = p;
        }

        if (iva <= 0) {
            System.err.println("Iva no válido");
        } else {
            iva = iva;
        }

        if (cuantosQ < 0) {
            System.err.println("Número no válido");
        } else {
            cuantosQuedan = cuantosQ;
        }
    }
    
    // Getters
    public String n(){
        return nombre;
    }
    public double p(){
        return precio;
    }
    public int iva(){
        return iva;
    }
    public int cQ(){
        return cuantosQuedan;
    }
    
    // Setters
    public void n(String n){
        this.nombre = n;
    }
    public void p(double p){
        this.precio = p;
    }
    public void iva(int iva){
        this.iva = iva;
    }
    public void cQ(int cQ){
        this.cuantosQuedan = cQ;
    }

}
