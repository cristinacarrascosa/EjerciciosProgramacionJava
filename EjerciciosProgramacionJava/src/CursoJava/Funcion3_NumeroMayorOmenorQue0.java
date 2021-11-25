/*Crear una funcion que indique si un numero es mayor o menor que cero
 */
package CursoJava;

/**
 *
 * @author carra
 */
public class Funcion3_NumeroMayorOmenorQue0 {
    
    public static void main(String[] args) {
        
        int num=0;
        
        // usamos un condicional para que quede mejor
        // como devuelve un booleano (true) podemos usarlo
        if(mayorQue0(num)){
            System.out.println(num+" es mayor que 0");
        }else {
            System.out.println(num+" es menor o igual que 0"); 
        }
        
       
        
    }
    
    public static boolean mayorQue0 (int num){
        
            return num>0;// directamente devuelve true si es así
            
        
    }
}
