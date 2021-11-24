package ud3ejercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a020834113t
 */
import java.util.Scanner; 

public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        double precio, total;
        int iva;
               
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el precio del producto");
        precio = entrada.nextDouble();
        
        System.out.println("Introduce el IVA a aplicar");
        iva = entrada.nextInt();
        
        if (precio <=0 || iva <=0) {
            System.out.println("Error al introducir los valores");
        } else {
            total = precio + (precio * iva / 100);
            System.out.println("El total es " + total);
       }
        
    }
    
}
