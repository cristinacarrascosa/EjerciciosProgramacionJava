/*Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej1rep {
    public static double multiplica(double a, double b){
        
        return a*b;
    }
    public static void main(String[] args) {
        // Variables 
        double a, b, res;
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce A: ");
        a = sc.nextDouble();
        System.out.print("Introduce B: ");
        b = sc.nextDouble();
        
        res = multiplica(a, b);
        System.out.println("Resulatdo: "+res);
    }
}
