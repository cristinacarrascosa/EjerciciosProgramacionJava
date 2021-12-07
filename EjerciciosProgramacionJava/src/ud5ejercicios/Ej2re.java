/*
 * Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor
de edad o no. Implementa y utiliza la función:
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej2re {
    public static boolean esMayorEdad(int a){
        if (a >=18){
           return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Variables
        int edad;
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // Pideo edad
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        // LLamo a la función
        if (esMayorEdad(edad)){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("No eres mayor de edad");
        }
    }
}
