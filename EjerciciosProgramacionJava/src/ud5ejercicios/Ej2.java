package ud5ejercicios;


import java.util.Scanner;

/*
 * Proyecto Ud5_ProgramacionModular - Archivo Ej2.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:40:29
 */
public class Ej2 {
    
    public static boolean esMayorEdad(int a) {
        
        if (a >= 18){   
            
        }
        return true;
        
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int a = sc.nextInt();
        System.out.println(esMayorEdad(a));
    }
    

    
}
