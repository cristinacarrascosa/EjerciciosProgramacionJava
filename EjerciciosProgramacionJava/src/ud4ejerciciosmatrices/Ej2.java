/*
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
 *   de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
 *  pantalla
 */
package ud4ejerciciosmatrices;

/**
 *
 * @author carra
 */
public class Ej2 {
    public static void main(String[] args) {
        // Variables
        int [][] matriz = new int [10][10];
        int cont;
        
        // Llenamos la matriz con for anidados
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j]= (i+1) * (j+1);
            }
        }
        // Motramos la matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Tabla del "+(i+1)+": ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    
}
