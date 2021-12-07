/*
 * Escribe un programa que pida un valor entero en millas y muestre su equivalente en
kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la
función:
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej5rep {
    public static double millas_a_kilometros(double millas){
        return 1.60934 * millas;
    }
    public static void main(String[] args) {
        // Variables
        double millas,km;
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // Pido datos
        System.out.print("Introduce las millas: ");
        millas = sc.nextDouble();
        
        // Llamo a la función
        km = millas_a_kilometros(millas);
        System.out.println("Kilómetros: "+km);
    }
}

