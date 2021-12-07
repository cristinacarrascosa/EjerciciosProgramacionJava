/*
 * Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá
recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del
triángulo.
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej14 {
    static void  triangulo (char a,int linea){
        // Para cada línea
        for (int i = 1; i <= linea; i++) {
            
            // Imprimimos espacios
            for (int j = i - 1; j < linea - 1; j++) {
                System.out.println(" ");
            }
            // Imprimimos el char pasado como argumento
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(a);
            }
            // Nueva linea
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        // Variables
        int linea;
        char car;
        
        Scanner sc = new Scanner(System.in);
        
        // Pedimos valores
        System.out.print("¿Cuántas líneas?: ");
        linea = sc.nextInt();
        System.out.print("¿Qué caracter?: ");
        car = sc.next().charAt(0);
        
        triangulo(car, linea);
        System.out.println("");
    }
}
