package ud5ejercicios;


import java.util.Scanner;

/*
 * Proyecto Ud5_ProgramacionModular - Archivo Ej4.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:33:55
 */
public class Ej4 {

    public static int dimeSigno(int a){
        
        if (a < 0) {
            return -1;
        }else if (a == 0){
            return 0;
        }else
            return 1;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int a = sc.nextInt();
        
        System.out.println(dimeSigno(a));
        
    }
}
