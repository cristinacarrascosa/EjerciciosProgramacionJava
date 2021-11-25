
package CursoJava;
//importamos el paquete util para poder utilizar la clase Scanner
import java.util.*;

public class Condicionales {

    public static void main(String[] args) {
        //creamos el Scanner para poder introducir datos
        Scanner entrada= new Scanner(System.in);
        //pedimos los datos
        System.out.println("Introduce tu edad, por favor");
        //guardamos los datos en variable edad que será de tipo int
        int edad=entrada.nextInt();
        
        if(edad >=18) {//construimos la condición a evaluar, normalmente, con operadores de comparación
        //edad mayor o igual a 18
            System.out.println("Eres mayor de edad");
            //esta se ejecuta en el caso de que sea afirmativo
        }else {
            System.out.println("Eres menor de edad");
            //esto se ejecuta en caso contrario
            //no puede haber un else sin un if, pero al contrario si
            
        }    
    }
}
