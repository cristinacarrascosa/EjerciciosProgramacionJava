/*
 * ejemplo práctico donde almacenamos una tabla de capital-interés.
 */
package ud4ejerciciosmatrices;

/**
 *
 * @author carra
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        // Variables
        double acumulado;
        double interes = 0.10;
        double [][] saldo = new double[6][5];
        
        for (int i = 0; i < 6; i++) {
            
            saldo [i][0] = 10000;// almacenamos en la primera dimension de nuestra matriz el capital inicial
            acumulado = 10000; // esta variable se irá incrementando
            for (int j = 1; j < 5; j++) { // empezamos a rellenar desde el 2º puesto, ya que el primero lo he rellenado con 10000
                // Ahora hacemos el cálculo
                acumulado = acumulado+(acumulado*interes);
                
                saldo[i][j]= acumulado;
                
            }
            // Incrementamos el interés
            interes = interes + 0.01;
        }
        // Ahora leemos la matriz
        for (int i = 0; i < 6; i++) {
            
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%1.2f",saldo [i][j]);
                System.out.print(" ");
            }
            
        }
        
    }
}
