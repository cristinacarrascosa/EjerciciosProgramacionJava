package ud5ejercicios;


import java.util.Scanner;

/*
 * Proyecto Ud5_ProgramacionModular - Archivo Ej1.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:26:58
 */
public class Ej1 {
    
    public static double multiplica(double a, double b){
                                        
        double mult = a * b;
        return mult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        System.out.println("resultado= "+multiplica(a, b));
    }
           
}
