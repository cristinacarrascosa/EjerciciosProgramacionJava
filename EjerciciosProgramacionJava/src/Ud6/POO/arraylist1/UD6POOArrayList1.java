
package ud6.poo.arraylist1;

import java.util.ArrayList;


public class UD6POOArrayList1 {

   
    public static void main(String[] args) {
        
        // Crea ArrayList de cadena de texto
        ArrayList<String> colores = new ArrayList();
        
        // Crear String con diferentes colores
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Naranja");
        colores.add("Blanco");
        
        // iterar array y mostrar los colores
        for (int i = 0; i <colores.size(); i++) {
            System.out.println(colores.get(i));
        }
        System.out.println("----------------------");
        // añadir elementos al final de la lista
        colores.add("Negro");
        colores.add("Cyan");
        
        for (int i = 0; i <colores.size(); i++) {
            System.out.println(colores.get(i));
        }
        
        System.out.println("----------------------");
        // Añadir colores en posiciones determinadas
        colores.add(1, "Amarillo");
        colores.add(2, "Magenta");
        colores.add(3, "Rojo");
        colores.add(4, "Azul");
        
        for (int i = 0; i <colores.size(); i++) {
            
            System.out.println(i+"."+colores.get(i));
        }
        System.out.println("-------------------");
        
        //Eliminar colores de determinadas posiciones
        colores.remove(3);
        colores.remove(4);
        
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(i+"."+colores.get(i));
        }
    }
    
}
