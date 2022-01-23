
package Ud6.POO.Ejercicios3.Reloj;

import java.util.Scanner;


public class ProgramaReloj {
    
    public static void main(String[] args) {
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        
        
        Reloj [] arrayRelojes= new Reloj[5];
        
        for (int i = 0; i < arrayRelojes.length; i++) {
            System.out.println("Introduce la hora");
            int hora = sc.nextInt();
            System.out.println("Introduce los minutos");
            int minutos = sc.nextInt();
            System.out.println("Introduce los segundos");
            int segundos = sc.nextInt();
            
            arrayRelojes[i]= new Reloj(hora, minutos, segundos);
        }
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].imprimeHora();
            arrayRelojes[i].tick();
        }
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].imprimeHora();
            arrayRelojes[i].tick(60);
        }
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].imprimeHora();
        }
        
        
        
    }
    
}
