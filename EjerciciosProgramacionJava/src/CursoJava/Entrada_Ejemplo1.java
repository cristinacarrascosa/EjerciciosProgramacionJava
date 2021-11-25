
package CursoJava;

import java.util.Scanner;//tenemos que importal el paquete util para utilizar
//la clase Scanner



public class Entrada_Ejemplo1 {
    
    public static void main(String[] args) {
        
        //1ºCreamos el objeto de tipo Scanner
        Scanner entrada=new Scanner(System.in);
        //Un constructor es un método especial, poseen el mismo nombre que la clase
        //en este caso es el paquete Scaner
        //lee los datos que vamos a introducri desde la consola System.in
        
        //2ºImprimir un mensaje por pantalla que el usuario puede leer
        System.out.println("Introduce tu nombre, por favor");
        
        //3ºdeclaramos la variable y su tipo y le decimos que va a ser del tipo nexLine, en este caso
        //tenemos que utilizar el objeto pertenciente a la clase Scanner "entrada"
        String nombre_usuario = entrada.nextLine();
        
        System.out.println("Introduce edad, por favor");
        
        int edad= entrada.nextInt();
        
        System.out.println("Hola "+ nombre_usuario+". El año que viene tendrás "+(edad+1)+" años.");
    }
    
}
