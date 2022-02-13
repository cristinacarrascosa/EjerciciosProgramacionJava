package ud6.poo.arraylist1;

import java.util.ArrayList;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Crear arrayList para notas
        ArrayList<Integer> notas = new ArrayList();

        // Variables
        int nota, aprobados = 0, suspendidos = 0, diez = 0, notaMedia=0;

        //Pedir notas por teclado hasta que se introduzca un -1
        do {
            System.out.println("Introduce tu nota, teclea -1 para finalizar");
            nota = sc.nextInt();
            if (nota != -1) {
                notas.add(nota);
            }
            if (nota >= 5) {
                aprobados++;
            } else if (nota < 5 && nota != -1) {
                suspendidos++;
            }
            if (nota == 10) {
                diez++;
            }

        } while (nota != -1);

        System.out.println("**** Tus notas son ****");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
            notaMedia+=(notas.get(i));
            
        }
        
        notaMedia = notaMedia/notas.size();
        System.out.println("Tienes " + aprobados + " aprobados");
        System.out.println("Tienes " + suspendidos + " suspendidos");
        System.out.println("Tienes " + diez + " dieces.");
        System.out.println("Tu nota media es: " + notaMedia);

    }
}
