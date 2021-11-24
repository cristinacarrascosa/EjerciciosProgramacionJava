package ud5ejercicios;


import java.util.Scanner;

/*
 * Proyecto Ud5_ProgramacionModular - Archivo Ej3.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:23:25
 */
public class Ej3 {
    
    public static int minimo(int a, int b){
        
        return Math.min(a, b);
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce dos números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("El menor es: "+ minimo(a, b));
    }
}
