package ud3ejercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a020834113t
 */

public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int dado;
    int num;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Adivina el número");
    num = entrada.nextInt();
    
    dado = (int)(1 + Math.random() * 6);
    System.out.println("En el dado ha salido el " + dado);
    
    if (num == dado){
        System.out.println("Has acertado");
    } else
        System.out.println("Fallaste");
    
    }
    
}
