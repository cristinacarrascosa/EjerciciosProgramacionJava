/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoJava;
import java.util.Scanner;
/**
 *
 * @author carra
 */
public class BucleWhile2 {
    //El programa genera un número aleatorio y nosotros intentamos averiguarlo
    //El programa nos irá lanzando pistas, diciéndonos si es fmayor o menor
    
    public static void main(String[] args) {
        //el programa genera un número aleatorio entre 0 y 100
        //para ello utilizamos el método random de la clase Math que devuelve un doble
        //es estático, por lo que pondremos la clase delante del método Math.random
        //random nos generará un número entre 0 y 1
        int aleatorio=(int)(Math.random()*100);
        //System.out.println(Math.random()*100);//si lo multiplicamos por 100
        //desplazará la como dos decimales
        //convertiremo e dato a entero con una refundición, para eso declaramos una varible de tipo entero
        //está sera aletarorio para eso usamos (int)
                
        //creamos el scanner
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int intentos=0;
        
        while(numero!=aleatorio){
            
        }
        
        
    }
    
}
