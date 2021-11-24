/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3ejercicios;

/**
 *
 * @author a020834113t
 */
public class EjemploWhile {
    public static void main(String[] args) {
        int x = 1;
        
        //salir cuando x llega a ser mayor que 4
        while (x <= 10)
        {
            System.out.println("Valor de x: "+x);
            
            //incrementa el valor de x para la siguiente iteración
            x++;
        }
    }
    
}
