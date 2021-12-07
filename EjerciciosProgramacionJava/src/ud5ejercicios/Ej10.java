/*
 * Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y
nos diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días.
Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no.
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej10 {
    public static boolean fechaCorrecta (int d,int m,int a){
        if (d >= 1 && d<=30 && m >= 1 && m <= 12 ){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        // Variables
        boolean escorrecta;
        int dia, mes, año;
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // pido datos
        System.out.print("Introduce día: ");
        dia = sc.nextInt();
        System.out.print("Introduce mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce año: ");
        año = sc.nextInt();
        
        escorrecta = fechaCorrecta(dia, mes, año);
        
        if (escorrecta){
            System.out.println("La fecha es correcta");
        }else {
            System.out.println("La fecha no está correcta");
        }
    }
    
}
