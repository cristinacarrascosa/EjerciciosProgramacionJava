/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej13B {
    public static double calcula_porc_dto(double precio, double pvp) {
        return 100 * (1.0 - (pvp / precio));
    }

    public static void main(String[] args) {
        double precio, pvp, porc_dto;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio original: ");
        precio = sc.nextDouble();
        System.out.print("Precio tras descuento: ");
        pvp = sc.nextDouble();
        
        porc_dto = calcula_porc_dto(precio, pvp);
        
        System.out.printf("Descuento : %.2f%%", porc_dto);
    }
}
