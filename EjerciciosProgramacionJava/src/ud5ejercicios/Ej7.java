package ud5ejercicios;


import java.util.Scanner;

/*
 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su
área y su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área
 */

/**
 *
 * @author carra
 */
public class Ej7 {
    
    // Devuelve el perímetro
    public static double perimetroRectangulo(double ancho, double alto){
        
        return 2*(ancho+alto);
        
    }
    
    // Devuelve el área
    public static double areaRectangulo(double ancho, double alto){
        
        return ancho * alto;
        
    }
    
    public static void main(String[] args) {
        
        // Variables
        double area, perimetro, ancho, alto;
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el ancho: ");
        ancho = sc.nextDouble();
        System.out.print("Introduce el alto: ");
        alto = sc.nextDouble();
        
        System.out.println("El área es: "+ areaRectangulo(ancho, alto));
        System.out.println("El perímetro es: "+ perimetroRectangulo(ancho, alto));
    }
    
}
