/*
 * Escribe un programa que cree un array de tamaño 100 con los primeros 100 números
naturales. Luego muestra la suma total y la media. Implementa una función que calcule la
suma de un array y otra que calcule la media de un array
 */
package ud5ejercicios;

/**
 *
 * @author carra
 */
public class Ej15 {
    public static int sumaArray (int[]array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
    public static double mediaArray (int[]array){
        return (double)sumaArray(array)/(double)array.length;
    }
    public static void main(String[] args) {
        //Variables
        int [] vec = new int [100];
        
        // LLenamos array
        for (int i = 0; i <100; i++) {
            vec[i] = i+1;
            
        }
        // usamos las funciones
        System.out.println("Suma: "+sumaArray(vec));
        System.out.println("Media: "+mediaArray(vec));
    }
}    
