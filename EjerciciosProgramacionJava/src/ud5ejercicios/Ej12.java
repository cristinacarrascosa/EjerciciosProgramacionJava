/*
 * Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
programa debe tener una función que reciba como parámetro una cantidad en kilómetros
y nos la devuelva en millas.
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej12 {
    public static double kilometros_a_millas (double n){
        return  n / 1.60934;
    }
    public static void main(String[] args) {
        // Variables
        double km, millas;
        Scanner sc = new Scanner(System.in);
        // pido km
        System.out.println("Introduce kilómetros");
        km = sc.nextDouble();
        System.out.println(km+ "km son "+ kilometros_a_millas(km)+" millas");
    }
}

