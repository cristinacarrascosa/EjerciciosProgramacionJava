/*
 *  ejemplo donde rellenamos una matriz con números aleatorios.
 */
package CursoJava;

/**
 *
 * @author carra
 */
public class MatrizConNumerosAleatorios {
    
    public static void main(String[] args) {
        
        // Declaramos matriz y su tamaño
        int [] matriz_aleatorios=new int[150];
        
        for (int i = 0; i < matriz_aleatorios.length; i++) {
            // Rellenamos la matriz con números aleatorios
            // pero como Math.random devuelve un double
            // tenemos que refundirlo en un (int)
            // Math.round para que lo redondee
            // *100 para que genere números aleatorios entre 0 y 100
            matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
            
        }
        // creamos un bucle for each para recorrer la matriz
        for (int numeros : matriz_aleatorios) {
            System.out.print(numeros+ " ");
            
        }
    }
    
}
