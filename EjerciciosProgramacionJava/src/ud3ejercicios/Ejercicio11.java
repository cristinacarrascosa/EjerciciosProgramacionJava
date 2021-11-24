package ud3ejercicios;

import java.util.Scanner;
/**
 *
 * @author carra
 */
public class Ejercicio11 {

    /**Realiza un programa que pida el día de la semana (del 1 al 7) y muestre por pantalla
el día correspondiente (Lunes, martes...). Si introducimos otro número mostrará un
mensaje de error.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creo el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //creo la variable
        int dia;
        //pido datos al usuario y los almaceno en la varible
        System.out.println("Dime el nº de la semana");
        dia = entrada.nextInt();
        //creo el switch con la variable
        switch (dia){ //ahora pongo los casos según el número
            case 1: //caso en el que variable día contiene el valor 1
                System.out.println("Lunes");//pueden ser varias instrucciones1
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: //cuando no es ninguno de los otros casos
                System.out.println("Error, número no válido");
                        
        }
    }
    
}