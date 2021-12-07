/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4ejerciciosmatrices;

/**
 *
 * @author carra
 */
public class Ejemplo {
    public static void main(String[] args) {
        int [][] matrix = new int [4][5];
        
        //rellenamos la matriz
        matrix[0][0]=15;
        matrix[0][1]=21;
        matrix[0][2]=18;
        matrix[0][3]=9;
        matrix[0][4]=15;
                
        matrix[1][0]=10;
        matrix[1][1]=52;
        matrix[1][2]=17;
        matrix[1][3]=19;
        matrix[1][4]=7;
        
        matrix[2][0]=19;
        matrix[2][1]=2;
        matrix[2][2]=19;
        matrix[2][3]=17;
        matrix[2][4]=7;
        
        matrix[3][0]=92;
        matrix[3][1]=13;
        matrix[3][2]=13;
        matrix[3][3]=32;
        matrix[3][4]=41;
        
        // Imprimir un valor de la matriz
        //System.out.println(matrix[2][3]);
        // BUCLES PARA RECORRER EL ARRAY
        // Este primer bucle recorre la primera dimensión
        for (int i = 0; i < 4; i++) {
            System.out.println("");// este salto de línea lo ponemos para que imprima en forma de tabla
            // Este segundo bucle recorre la segunda dimensión
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
        }
    }
}
