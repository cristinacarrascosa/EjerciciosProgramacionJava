
package CursoJava;

import javax.swing.*;


public class EntradaNumeros2 {
    
    public static void main(String[] args) {
        
        String num1=JOptionPane.showInputDialog("Introduce un número");
        //con esto tenemos la ventanita que nos va a decir que introduzcamos un número
        //el valor que introduzcamos se almacenará en un String de tipo texto
        
        //Ahor transformamos el string al double
        double num2=Double.parseDouble(num1);
        
        System.out.print("La raíz de "+ num2+ " es ");
        //Imprimimos un mensaje
        
        
        System.out.printf("%1.2f", Math.sqrt(num2));
        //imprimimos el resultado que de la raíz cuadrada con dos decimales
        //el método sqrt de la clase math necesita que num2 sea de tipo double
    }   
}
