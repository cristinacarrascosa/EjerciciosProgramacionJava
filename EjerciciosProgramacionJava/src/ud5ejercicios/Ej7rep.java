/*
 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su
área y su perímetro. Implementa y utiliza las funciones:
 */
package ud5ejercicios;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej7rep {
    public static double perimetroRectangulo(double ancho, double alto){
        return 2*(ancho + alto);
    }
    public static double areaRectangulo(double ancho, double alto){
        return ancho * alto;
    }
    public static void main(String[] args) {
        // Variables
        double base,altura;
        
        // Creo Scanner
        Scanner sc = new Scanner(System.in);
        // Pido datos
        System.out.print("Introduce base: ");
        base = sc.nextDouble();
        System.out.print("Introduce altura: ");
        altura = sc.nextDouble();
        
        // Llamamos a las distintas funciones
        System.out.println("El área es: "+areaRectangulo(base, altura)+"cm2");
        System.out.println("El perímetro es: "+perimetroRectangulo(base, altura)+"cm");
    }
}
