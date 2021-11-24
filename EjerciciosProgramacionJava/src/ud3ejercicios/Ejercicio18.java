package ud3ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        char letra;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un caracter");
        letra = entrada.nextLine().charAt(0);
        
        if (letra >= 'A' && letra <='Z') {
            System.out.println("Es mayúscula");
        } else {
            System.out.println("Es minúscula");
        }
        
        
    }
    
}
