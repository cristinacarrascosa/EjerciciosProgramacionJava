package ud3ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String[] args) {
        /*.Escribe un programa que lea la temperatura en centígrados (entero) del día e imprima
        el tipo de clima de acuerdo a la siguiente lista:
        ◦ Temperatura menor que 10 => Frío
        ◦ Temperatura entre 10 y 19 => Templado
        ◦ Temperatura entre 20 y 29 => Caluroso
        ◦ Temperatura mayor que 29 => Tropical*/
        
        Scanner entrada = new Scanner(System.in);
        
        int temperatura;
        
        System.out.print("Introduce la temperatura en centígrados");
        
        temperatura = entrada.nextInt();
        
        if (temperatura < 10) {
            System.out.println("Frío");
            
        } else if (temperatura <= 19) {
            System.out.println("Templado");
            
        } else if (temperatura <= 29) {
            System.out.println("caluroso");
            
        } else {
            System.out.println("Tropical");
        }

    }
}