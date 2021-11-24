package ud3ejercicios;

import java.util.Scanner;
/**
 *
 * @author carra
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int mes;
        
        System.out.println("Dime el nº del mes");
        mes = entrada.nextInt();
        
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Error, nº incorrecto");
        }
        // TODO code application logic here
    }
    
}
