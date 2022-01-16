/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ud6.POO.Ejercicios2.Coche;

import java.awt.Color;



/**
 *
 * @author carra
 */
public class ProgramaCoche {
    
    public static void main(String[] args) {
        
        Coche c1 = new Coche("Seat Ibiza", Color.yellow, "9094BSC", true, 1995, Tipo.FAMILIAR, Seguro.TERCEROS);
        c1.imprime();
        
        Coche c2 = new Coche("Ferrary", Color.RED, "1236GFT", true, 2020, Tipo.DEPORTIVO, Seguro.TODO_RIESGO);
        c2.imprime();
    }
    
}
