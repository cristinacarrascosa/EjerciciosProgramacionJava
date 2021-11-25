
 
package CursoJava;


public class Constantes {
    public static void main(String[] args) {
        
        final double apulgadas = 2.54;//con final declaramos una constante y no nos dejará cambiar su valor
         //int operador1, operador2, resultado//puedes declarar varias variables en una misma línea
        //se usan cuando queremos crear un programa que convierta de metros a pulgadas, por ejemplo
        double cm=6;
        
        double resultado= cm/apulgadas;
        
        System.out.println("En "+ cm + " cm hay "+resultado+ " pulgadas");
    }
}
