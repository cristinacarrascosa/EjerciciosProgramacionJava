/* Suma de dos números enteros
 * funcion que devuelve un valor de tipo int, 
por eso no lleva void en el public

 */
package CursoJava;

/**
 *
 * @author carra
 */
public class Funcion2suma {
    
    public static void main(String[] args) {
        
        int num1 = 5;   // las variables para usar la funcion las podemos llamar
                        // como queramos, siempre y cuando sean datos del mismo tipo
        int num2 = 10;  // del que es la función (int)
        
        System.out.println("El resultado es : "+suma(num1,num2));
        
    }
    
    public static int suma(int a, int b){

    return a + b;// UNA FUNCION ESTÁ OBLIGADA A DEVOLVER ALGO
    }
}

