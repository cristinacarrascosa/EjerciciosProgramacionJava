/*
 * Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del
 *1 al 25 y luego muestre la matriz por pantalla.
 */
package ud4ejerciciosmatrices;

/**
 *
 * @author carra
 */
public class Ej1 {
    public static void main(String[] args) {
        // Variables
        int [][] matriz = new int [5][5];
        int contador = 1;
        
        // Llenamos la matriz con for anidados
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j] = contador;
                contador ++;
            }
            
        }
        // Motramos la matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila "+i+": ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
