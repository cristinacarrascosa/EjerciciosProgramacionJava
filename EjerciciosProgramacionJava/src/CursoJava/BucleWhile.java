/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoJava;
import javax.swing.*;

public class BucleWhile {
    //creamos un acceso a una aplicación que nos pedirá la contraseña 
    //a través de una ventana JOptionPan
    public static void main(String[] args) {
        
        String clave ="Cristina";//aquí almacenamos la contraseña
        
        String pass="";//variable vacía de tipo string
        
        while (clave.equals(pass)==false) {
           //si el texto clave no es igual al texto pass
           
           pass=JOptionPane.showInputDialog("introduce la contraseña, por favor");
           
           if (clave.equals(pass)==false){
               //si clave es diferente a pass
               System.out.println("Contraseña incorrecta");
               
           }
        
            
        }
        System.out.println("Contraseña correcta. Acceso permitido");
        
        
    }
    
}
