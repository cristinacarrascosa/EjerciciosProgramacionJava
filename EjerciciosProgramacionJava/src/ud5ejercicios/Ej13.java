/*
 * Realiza un programa que calcule el porcentaje de descuento que nos han hecho al
comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento
aplicado. Se debe crear una función a la que le pasemos ambos valores y nos devuelva
el descuento.
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej13 {
    public static double porcentajeDto (double precioAnt,double precioFinal){
        double dto =(precioFinal/precioAnt)*100;
        return 100 - dto;
    }
    public static void main(String[] args) {
        // Variables
        double precioAnt, precioFinal;
        
        Scanner sc = new Scanner(System.in);
        
        // Pido precios
        System.out.print("Introduce la cantidad sin descuento: ");
        precioAnt = sc.nextDouble();
        System.out.print("Introduce la cantidad con el descuento aplicado: ");
        precioFinal = sc.nextDouble();
        
        System.out.println("Te han descontado un "+porcentajeDto(precioAnt, precioFinal)+"%");
    }
}
