/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ud6.Ejercicios.Articulo;

/**
 *
 * @author carra
 */
public class ProgramaArticulo {

    public static void main(String[] args) {
        
        Articulo a1 = new Articulo();
        
        a1.nombre="Pijama";
        a1.precio=100;
        a1.cuantosQuedan= 10;
        
        System.out.println(a1.nombre+" - Precio: "+a1.precio+"euros - IVA: "+a1.iva+"% - PVP: "+(a1.precio+(a1.precio*a1.iva/100)));
    }
}
