package ud5ejercicios;


import java.util.Scanner;

/*
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
cada uno tras aplicarle un 21% de IVA. 
 */

/**
 *
 * @author carra
 */
public class Ej6 {
    
    // Devuelve el precio tras sumarle un 21% de IVA
    public static double precioConIVA(double precio){
    
        return precio * 1.21;
    
}
    
    public static void main(String[] args) {
        
        // Variables
        double precioSin, precioCon;
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
          System.out.print("Introduce precio sin IVA: ");
          precioSin= sc.nextDouble();
          precioCon = precioConIVA(precioSin);
            System.out.println("Precio con IVA: "+ precioCon);
          
        }
        
        
        
        
    }
    
    
}
