
package Ud6.POO.Ejercicios3.Reloj;


import java.util.Scanner;


public class ProgramaReloj {
    
    public static void main(String[] args) {
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        
        // Creo el array
        Reloj [] arrayRelojes= new Reloj[3];
        
        
        // for para crear relojes
        for (int i = 0; i < arrayRelojes.length; i++) {
            System.out.println("Introduce la hora");
            int hora = sc.nextInt();
            System.out.println("Introduce los minutos");
            int minutos = sc.nextInt();
            System.out.println("Introduce los segundos");
            int segundos = sc.nextInt();
            
            arrayRelojes[i]= new Reloj(hora, minutos, segundos);
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].imprimeHora();
            arrayRelojes[i].tick();
            
        }
        System.out.println("--------- UN SEGUNDO -----------------");
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].imprimeHora();
        }
        
        // CON MÉTODO
        System.out.println("--------- UN MINUTO -----------------");
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].tick(60);
            arrayRelojes[i].imprimeHora();
        }
        System.out.println("---------- UNA HORA -----------------");
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].tick(3600);
            arrayRelojes[i].imprimeHora();
        }
        System.out.println("*****************************************");
        // CON FOR
        
        for (int i = 0; i < arrayRelojes.length; i++) {
            for (int j = 0; j < 60; j++) {
                arrayRelojes[i].tick();
            }
        }
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].imprimeHora();
        }
        System.out.println("****************************************");
        for (int i = 0; i < arrayRelojes.length; i++) {
            for (int j = 0; j < 3600; j++) {
                arrayRelojes[i].tick();
            }
        }
        for (int i = 0; i < arrayRelojes.length; i++) {
            arrayRelojes[i].imprimeHora();
            
        }
    }
    
}
