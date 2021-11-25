/*
 * con ejemplo del bucle for each y rellenado con numeros aleatorios
 */
package CursoJava;

/**
 *
 * @author carra
 */
public class UsoArrays_II {
    
    public static void main(String[] args) {
        
        // Declaración del Array de forma simplificada
        String [] paises = {"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};
        
        /* Declaramos el Array
        String [] paises= new String[8];
        
        //Rellenamos el Array
        paises[0]="España";
        paises[1]="Méximo";
        paises[2]="Colombia";
        paises[3]="Perú";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Ecuador";
        paises[7]="Venezuela";
        
         con este bucle for mostramos el contenido de Array
        for (int i = 0; i < paises.length; i++) {
            
            System.out.println("País "+ (i+1)+ " "+ paises[i]);
                            
        }*/
        
        /* Sintaxi del bucle for each
        primero declaramos un variable del mismo tipo que la matriz "String elemento";
        después ponemos el nombre de la matriz "paises"
        por último abrimos la llave del bucle for*/

        for (String elemento : paises) {
            System.out.println("País: "+ elemento);// mostramos los valores de la matriz
            
        }
    }
    
}
