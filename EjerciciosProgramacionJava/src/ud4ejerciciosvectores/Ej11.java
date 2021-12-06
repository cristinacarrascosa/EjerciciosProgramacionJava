/*.Crea un programa que cree dos arrays de enteros de tamaño 10. Luego introducirá en
el primer array todos los valores del 1 al 10. Por último, deberá copiar todos los
valores del primer array al segundo array en orden inverso, y mostrar ambos por
pantalla.
 */
package ud4ejerciciosvectores;

/**
 *
 * @author carra
 */
public class Ej11 {
    
    public static void main(String[] args) {
        
         // Variables
        int[] vec1 = new int[10];
        int[] vec2 = new int[10];
        
        // Llenamos array1
        for (int i = 0; i < vec1.length; i++) {
            vec1[i]= i+1;
        }
        
        // copiamos array1 en arra2 en orden inverso
        for (int i = 0; i < vec2.length; i++) {
            vec2[i]= vec1[9-i];
        }
        
        // muestro array 1
        for (int i = 0; i < vec1.length; i++) {
            System.out.println(i+": "+vec1[i]);
        }
        // hacemos un salto de línea
        System.out.println("");
        
        // mostramos array2
        for (int i = 0; i < vec2.length; i++) {
            System.out.println(i+": "+vec2[i]);
        }
    }
    
}
