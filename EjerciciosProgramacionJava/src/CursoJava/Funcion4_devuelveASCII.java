/*Crear una función que nos devuelva el número ASCII de un acracter pasado por 
parámetro
 */
package CursoJava;

/**
 *
 * @author carra
 */
public class Funcion4_devuelveASCII {
    
    public static void main(String[] args) {
        
        char caracter='4';
        
        System.out.println("El caracter '"+caracter+"' tiene el código ASCII: "+devuelveCodigoASCII(caracter));
    }
    
    public static int devuelveCodigoASCII(char caracter){
        
        return (int)caracter;
        
    }
}
