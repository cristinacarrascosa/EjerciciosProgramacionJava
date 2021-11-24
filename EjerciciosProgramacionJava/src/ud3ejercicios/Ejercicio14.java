package ud3ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main (String[] args) {
        
        /*Escribe un programa que pida cuantas mujeres y hombres hay en un aula y muestre
        el porcentaje de mujeres y hombres que hay. También mostrará un mensaje
        indicando si hay más mujeres, o más hombres o si hay los mismos*/
        
        Scanner entrada = new Scanner(System.in);
        
        int muj, hom;
        
        System.out.println("Introduce en nº de mujeres");
        muj = entrada.nextInt();
        
        System.out.println("Introduce en nº de hombres");
        hom = entrada.nextInt();
        
        int pmuj = (muj * 100)/(muj + hom);
        int phom = (hom * 100)/(muj + hom);
        
        System.out.println("El porcentaje de mujeres de la clase es " + pmuj + "% y el porcentaje de hombres de la clase es "+ phom +"%");
        
        if (muj > hom) {
            System.out.println("Hay más mujeres que hombres");
        } else if (hom > muj) {
            System.out.println("Hay más hombres que mujeres");
        } else {
            System.out.println("Hay la misma cantidad de hombres que de mujeres");
        }
    }
}