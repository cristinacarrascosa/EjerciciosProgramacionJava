/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3ejercicios;

import java.util.Scanner;

/**
 *
 * @author a020834113t
 */
public class EjemplodoWhile {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);

    int nota;

    
        do {
            System.out.println("Dime una nota");
        nota = in.nextInt();
        total += nota;

    }
    while (nota

    != 0);
    System.out.println (

"Total : "+ total);
    }
}
