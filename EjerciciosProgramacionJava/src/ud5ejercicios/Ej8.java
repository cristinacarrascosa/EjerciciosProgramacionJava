/*
 * Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N,
el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las
funciones:

 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej8 {
    public static int suma1aN(int n){
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    public static int producto1aN(int n){
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= i;
        }
        return producto;
    }
    public static double intermedio1aN(int n){
        return (1.0 + (double)n)/2.0;
    }
    public static void main(String[] args) {
        // Variables
        int n;
        double suma,prod,inter;
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // Pido N
        System.out.print("Introduce N: ");
        n = sc.nextInt();
        
        // LLamamos a las distintas funciones
        suma = suma1aN(n);
        prod = producto1aN(n);
        inter = intermedio1aN(n);
        
        // Mostramos 
        System.out.println("Suma de 1 a N: "+suma);
        System.out.println("Producto de 1 a N: "+prod);
        System.out.println("Intermedio de 1 a N: "+inter);
    }
}
