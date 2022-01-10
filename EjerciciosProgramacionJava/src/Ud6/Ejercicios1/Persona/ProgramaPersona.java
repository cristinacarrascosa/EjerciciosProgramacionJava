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
        
        persona persona1 = new persona();
        System.out.println("Introduce DNI");
        persona1.dni= sc.nextLine();
        System.out.println("Introduce nombre");
        persona1.nombre = sc.nextLine();
        System.out.println("Introduce apellidos");
        persona1.apellidos = sc.nextLine();
        System.out.println("Introduce edad");
        persona1.edad= sc.nextInt();
        
        sc.nextLine();
        persona persona2 = new persona();
        System.out.println("Introduce DNI");
        persona2.dni= sc.nextLine();
        System.out.println("Introduce nombre");
        persona2.nombre = sc.nextLine();
        System.out.println("Introduce apellidos");
        persona2.apellidos = sc.nextLine();
        System.out.println("Introduce edad");
        persona2.edad= sc.nextInt();
        System.out.println(persona1.nombre+" "+persona1.apellidos+" "+persona1.dni+" "+persona1.edad);
        System.out.println(persona2.nombre+" "+persona2.apellidos+" "+persona2.dni+" "+persona2.edad);
    }

}
