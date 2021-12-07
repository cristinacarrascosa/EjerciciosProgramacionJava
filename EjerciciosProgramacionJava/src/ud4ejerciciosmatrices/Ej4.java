/*
 *Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
“Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
teclado y luego el programa mostrará la nota mínima, máxima y media de cada
alumno.
 */
package ud4ejerciciosmatrices;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej4 {
    public static void main(String[] args) {
        // Variables
        int alumnos = 4;
        int asignaturas = 5;
        int [][] notas = new int [alumnos][asignaturas];
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        
        // Pido notas
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Dime notas alumno "+(i+1));
            for (int j = 0; j < asignaturas; j++) {
                notas [i][j]= sc.nextInt();
            }
            
        }
        // Mostramos las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Alumno "+(i+1)+": ");
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j]+" ");
            }
            System.out.println("");
        }
        // Para cada alumno calculamos nota mínima, máxima y media
        for (int i = 0; i < alumnos; i++) {
            // Declaramos variables
            int total = 0;
            int min = notas[i][0];
            int max = notas[i][0];
            // Recorremos las notas del alumno
            for (int j = 0; j < asignaturas; j++) {
                total += notas[i][j];
                min = Math.min(min,notas[i][j]);
                max = Math.max(max,notas[i][j]);
            }
            // Mostramos estadísticas de cada alumno
            System.out.println("ALUMNO "+(i+1));
            System.out.println("Media: "+(double)total/asignaturas);
            System.out.println("Máxima: "+max);
            System.out.println("Mínima: "+min);
            System.out.println("");
        }
    }
    
}
