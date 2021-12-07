/*
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:

 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej6rep {
    public static double precioConIVA(double precio){
        return precio + (precio * 0.21);
    }
    public static void main(String[] args) {
        // Variables
        double precio;
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // Pido precios
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce precio "+i+": ");
            precio = sc.nextDouble();
            System.out.println("Precio con IVA: "+precioConIVA(precio));
        }
        
    }
}
