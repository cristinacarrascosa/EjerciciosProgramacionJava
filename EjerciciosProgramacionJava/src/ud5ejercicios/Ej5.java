package ud5ejercicios;


import java.util.Scanner;

/*
 * Proyecto Ud5_ProgramacionModular - Archivo Ej5.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:43:09
 */
public class Ej5 {
    
    public static double millas_a_kilometros(double millas){
        
         return 1.60934 * millas;
        
    }

    
    public static void main(String[] args) {
        
        // Variables
        double millas, km;
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce las millas: ");
        millas = sc.nextDouble();
        
        km = millas_a_kilometros(millas);
        System.out.println("kilómetros: "+km);
        
        
    }
    
}
