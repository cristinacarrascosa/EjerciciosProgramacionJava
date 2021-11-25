
package CursoJava;

import java.util.*;

public class CondicionalesAnidados {
    
    public static void main(String[] args) {
       
        //creamos el Scanner para poder introducir datos
        Scanner entrada= new Scanner(System.in);
        //pedimos los datos
        System.out.println("Introduce tu edad, por favor");
        //guardamos los datos en variable edad que será de tipo int
        int edad=entrada.nextInt();
        
        if (edad<18) {
            System.out.println("Eres un adolescente");
        } 
        else if (edad < 40) {
            System.out.println("Eres joven");
        } 
        else if (edad <65) {
            System.out.println("Eres maduro");
        } 
        else {
            System.out.println("Cuídate");
        }
    }
}
