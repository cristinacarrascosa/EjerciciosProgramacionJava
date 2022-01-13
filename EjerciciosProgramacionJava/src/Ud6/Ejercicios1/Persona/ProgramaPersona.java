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

        Persona persona1 = new Persona("20834113U","cristina", "carrascosa", 21);

        Persona persona2 = new Persona("123456789D","clara", "carrascosa", 45);
        
        Persona p3 = new Persona("132456987D","Pepa","Gimeno", 25);

        System.out.println(persona1.getDni()+" "+ persona1.getNom() + " " + persona1.getAp() + " " + persona1.getEd());
        System.out.println(persona2.getDni()+" "+ persona2.getNom() + " " + persona2.getAp() + " " + persona2.getEd());
        System.out.println(p3.getDni()+" "+ p3.getNom() + " " + p3.getAp() + " " + p3.getEd());
        
    }

}
