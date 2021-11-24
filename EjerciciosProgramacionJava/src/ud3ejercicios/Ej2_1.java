package ud3ejercicios;

import java.util.Scanner;

public class Ej2_1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        int a, b;
            System.out.println("Introduce un número entero");
            a = entrada.nextInt();
            System.out.println("Introduce otro número entero");
            b = entrada.nextInt();

        while (a <= 0 && b <= 0){
            
            System.out.println("Los números introducidos son: "+a+"y"+b); 
        }  
            //System.err.println("El número introducido es erroneo");
    }

}
