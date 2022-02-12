/*
 * Proyecto Ud3EjerciciosBucles - Archivo Ej15.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ud3ejercicios;

import java.util.Scanner;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 21:13:07
 */
public class Ej15 {

    /**
     * Escribe un programa que pida 5 números al usuario y luego muestre por
     * pantalla si alguno era negativo y si alguno era mayor que 99
     */
    public static void main(String[] args) {

        int num;
        boolean negativo = false, mayor99 = false;

        Scanner sc = new Scanner(System.in);

        //pedimos 5 números
        for (int i = 0; i < 5; i++) {

            //pedimos número
            System.out.println("Introduce 5 números");
            num = sc.nextInt();

            //si alguno es negativo ponemos el interruptor a true
            if (num <= 0) {
                negativo = true;
                //si alguno es mayor a 99 ponemos el interruptor en true
            }
            if (num > 99) {
                mayor99 = true;
            }

        }
        //mostramos si alguno es negativo y los mayores de 99
        if (negativo) {
            System.out.println("Alguno era negativo");
        } else {
            System.out.println("Ninguno era negativo");
        }
        if (mayor99) {
            System.out.println("Alguno era mayor de 99");
        } else {
            System.out.println("Ninguno era mayor de 99");
        }
    }
}
