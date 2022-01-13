/*
 * Proyecto EjerciciosProgramacionJava - Archivo persona.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ud6.Ejercicios1.Persona;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:21:03
 */
public class Persona {
    
    
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    
    //Constructor
    public Persona(String id, String nom, String ap, int e){
        dni = id;
        nombre = nom;
        apellidos = ap;
        edad = e;
          
    }
    
    // Getters 
    public String getDni(){
        return dni;
    }
    public String getNom(){
        return nombre;
    }
    public String getAp(){
        return apellidos;
    }
    public int getEd(){
        return edad;
    }
    
    //Setters
    public void setId(String id){
        this.dni = id;
    }
    public void setNom(String n){
        this.nombre = n;
    }
    public void setAp(String a){
        this.apellidos = a;
    }
    public void setEd(int e){
        this.edad = e;
    }

}
