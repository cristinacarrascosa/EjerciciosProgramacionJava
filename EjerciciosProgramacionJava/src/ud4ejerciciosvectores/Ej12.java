/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4ejerciciosvectores;


import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej12 {
    public static void main(String[] args) {
        // Variables
        int[] numeros = new int [10];
        int valor, posicion;
        boolean salir = false;
        char opcion;
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        
        do {   
            System.out.println("------MENU-----");
            System.out.println("a. Mostrar valores\n"
                    + "b. Introducir valor\n"
                    + "c. Salir\n");
            System.out.print("Elige opción a, b o c: ");
            opcion = sc.nextLine().charAt(0);// Con charAt(0) le decimos que coja la primera letra
            
            switch (opcion){
                case 'a':
                    System.out.println("--- Array ---");
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i + ": "+numeros[i]);
                    }
                        break;
                        
                case 'b': 
                    System.out.println("Introduce valor: ");
                        valor = sc.nextInt();
                    System.out.println("Introduce posición: ");
                        posicion = sc.nextInt();
                        sc.nextLine();
                        numeros[posicion]= valor;
                        
                        break;
                
                case 'c':
                    salir = true;
                    System.out.println("Adios!");
                    break;
                    
                default:
                   
                    System.out.println("-----------------------");
                    System.out.println("OPCIÓN INCORRECTA");
                
            }
                    
            
        } while (!salir);
    }
}
