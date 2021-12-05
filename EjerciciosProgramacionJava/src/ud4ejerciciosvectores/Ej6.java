/*
 * Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
    N, escriba M en todas sus posiciones y lo muestre por pantalla
 */
package ud4ejerciciosvectores;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author carra
 */
public class Ej6 {
    
    public static void main(String[] args) {
        int num = 0;
            int[] vec = new int[num];
            int  pos;//variable para la longitud del vector
            
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Introduce la longitud del vector");
            num = sc.nextInt();
            System.out.println(" y el valor de sus posiciones");
            pos = sc.nextInt();
            
            Arrays.fill(vec, pos);
            
            /*for ( vec : pos){
                System.out.print(vec+" ");
            }*/
            
            /*for (int i = pos; i < num; i++) {
                 vec [i] = sc.nextInt();
            }*/    
            //for (int i = 0; i < num; i++) {//mostramos los valores
               // System.out.print(vec[i]+", ");
        
            System.out.println(vec);
    }
    
}
