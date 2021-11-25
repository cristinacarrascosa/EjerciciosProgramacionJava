/*Vemos en este vídeo el bucle for mejorado para leer los valores de un Array, también denominado bucle for-each.
Elaboramos un ejemplo en el que se rellena una matriz utilizando la clase JOptionPane
 */
package CursoJava;
import javax.swing.*;
/**
 *
 * @author carra
 */
public class UsuarioRellenaMatriz {
    
    public static void main(String[] args) {
        
        //Declaramos la matriz
        String [] paises=new String[8];
        
        //Bucle for para que pida al usuario datos
        for (int i = 0; i < paises.length; i++) {
            paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));//i+1 para que los numere para el usuario
        }
        
        //Bucle for each para que mueste el contenido de la matriz
        for (String elemento : paises) {
            
            System.out.println("País: "+ elemento);
        }
    }
    
}
