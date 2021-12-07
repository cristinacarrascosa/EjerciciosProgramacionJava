/*
 * .Realiza un programa que escriba la tabla de multiplicar de un número introducido por
teclado. Para ello implementa una función que reciba como parámetro un número entero
y muestre por pantalla la tabla de multiplicar de dicho número.
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej11 {
    public static void tablaMultiplicar (int a){
        System.out.println("TABLA DE MULTIPLICAR DEL "+a);
        for (int i = 0; i <= 10; i++) {
            System.out.println(a+" x "+i+" = "+(a*i));
        }
    }
    public static void main(String[] args) {
        // Variables
        int num;
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        
        // llamamos al método
        tablaMultiplicar(num);
    }
}
