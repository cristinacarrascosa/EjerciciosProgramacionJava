package ud3ejercicios;

import java.util.Scanner;

public class Ejercicio15_1 {
    public static void main (String[] args) {
        /*Escribe programa que pida las 3 notas (números enteros) de un alumno y luego
        muestre su nota final, calculada como la nota media expresada como un entero y
        redondeada al valor entero más próximo. Téngase en cuenta también que si alguna
        de las 3 notas es inferior a 5 la nota final debe ser como máximo un 4.*/
        
        int not1, not2, not3;
        double notMedia;
        int notaRedondeada;
        int notaFinal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la 1º nota");
        not1 = entrada.nextInt();
        
        System.out.println("Introduce la 2ª nota");
        not2 = entrada.nextInt();
        
        System.out.println("Introduce la 3ª nota");
        not3 = entrada.nextInt();
        
        //Calculamos la nota media y redondeada
        notMedia = (not1 + not2 + not3)/3.0;
        notaRedondeada = (int) Math.round(notMedia);
        
        //Calculamos la nota final
        if (not1 < 5 || not2 < 5 || not3 <5)
            notaFinal = Math.min(notaRedondeada, 4);
        else
            notaFinal = notaRedondeada;
            
        System.out.println("Tu nota media es : " + notMedia);
        System.out.println("Tu nota redondeada es : " + notaRedondeada);
        System.out.println("Tu nota final : " + notaFinal);
        
    }
}