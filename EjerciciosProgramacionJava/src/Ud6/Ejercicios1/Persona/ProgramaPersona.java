/*
 * Proyecto EjerciciosProgramacionJava - Archivo ProgramaPersona.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ud6.Ejercicios1.Persona;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:24:10
 */
public class ProgramaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Persona persona1 = new Persona("cristina", "carrascosa", 21);
       
        
        
        
        Persona persona2 = new Persona("clara", "carrascosa", 45);
        
        
        
        
        
        System.out.println(persona1.nombre+" "+persona1.apellidos+" "+ persona1.edad);
        System.out.println(persona2.nombre+" "+persona2.apellidos+" "+persona2.edad);
    }

}
