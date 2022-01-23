
package Ud6.POO.Ejercicios3.Coche;

import javax.swing.JOptionPane;


public class ProgramaCoche {
    
    public static void main(String[] args) {
        
        
        // Creamos array de objetos de la clase Coche
        Coche arrayObjetos[]= new Coche [3];
        
        //Pedimos datos
        for (int i = 0; i < arrayObjetos.length; i++) {
            String modelo=JOptionPane.showInputDialog("Modelo");
            String color=JOptionPane.showInputDialog("Color");
            int pinturaMetalizada=JOptionPane.showConfirmDialog(null,
                                 "Pintura Metalizada", "Please select",
                                 JOptionPane.YES_NO_OPTION);
            
        }
        for (int i = 0; i < arrayObjetos.length; i++) {
            arrayObjetos[i].imprime();
        }
    }
    
}
