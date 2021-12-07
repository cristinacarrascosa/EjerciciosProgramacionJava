/*
 * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej4rep {
    public  static int dimeSigno(int a){
        if (a < 0){
            return (-1);
        }else if (a == 0){
            return 0;
        }else
            return 1;
    }
    public static void main(String[] args) {
        // Variables
        int num;
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // Pido datos
        System.out.print("Introduce número: ");
        num = sc.nextInt();
        
        // LLamo a la función
        System.out.println("Negativo = -1\nCero = 0\nPositivo = 1");
        System.out.println("");
        System.out.println("EL NÚMERO ES: "+dimeSigno(num));
    }
}
