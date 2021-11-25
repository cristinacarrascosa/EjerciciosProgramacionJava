/*
 * Crea una función que devuelva un número aletario entre dos numeros enteros que 
    nostros les demos.
 */
package CursoJava;

/**
 *
 * @author carra
 */
public class Funcion5_numeroAleatorioEntreDosNumeros {
    
    public static void main(String[] args) {
        
        int min=0;
        int max=10;
        
       // int aleatorio=generaNumAleatorio(min, max);
        
       // System.out.println(aleatorio); // aquí se imprimirá un número aleatorio entre el mix y el max
       
        for (int i = 0; i < 20; i++) {
            System.out.print(" ,"+generaNumAleatorio(min, max));
            // este for ejecutará la función 10 veces
            
        }
        
    }
    
    public static int generaNumAleatorio(int minimo, int maximo){
        
        return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}
