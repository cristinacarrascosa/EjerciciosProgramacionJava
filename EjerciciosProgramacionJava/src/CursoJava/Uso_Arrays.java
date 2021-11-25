/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoJava;

/**
 *
 * @author carra
 */
public class Uso_Arrays {

    public static void main(String[] args) {

        /* Declaray un Array con 5 elementos
        int[] mi_matriz = new int[5];*/

        //Declarar y llenar una matriz
        int[] mi_matriz = {5, 38, -15, 92, 71, 15, 28, 89, 64, 38};


        /* Rellenar el Array con valores
        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=-15;
        mi_matriz[3]=92;
        mi_matriz[4]=71;

        Imprimir un valor de la matriz, en este caso el que está en la posición 3
        System.out.println(mi_matriz[3]);*/
        // Imprimir todos los valores del Array
        for (int i = 0; i < mi_matriz.length; i++) {/* con el nombrematriz.lenght
            imprime toda la longitud de la matriz, no necesitamos conocerla
             */

            System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);

        }

    }

}
