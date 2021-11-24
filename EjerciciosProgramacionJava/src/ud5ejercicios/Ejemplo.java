package ud5ejercicios;

/*
 * Proyecto Ud5_ProgramacionModular - Archivo Ejemplo.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:00:20
 */
public class Ejemplo {
    
    public static int suma(int a, int b){
        System.out.println("Estoy en la función");
        int res = a + b;
        return res;
    }
    
    
    public static void saludo(String nombre){
        System.out.println("¡Hola " + nombre + "!");
    }
    
    public static void saludo(String nombre, int veces){
        for (int i = 1; i <= veces; i++) {
            saludo(nombre);
        }
    }
    
    public static void main(String[] args) {
        /*int w = suma(5, 7);
        System.out.println(w);
        int q = suma(10, 200);
        System.out.println(q);*/
        
        saludo("Luis", 3);
        saludo("Lionel", 1);
        saludo("Cristina", 8);
        
    }

}
