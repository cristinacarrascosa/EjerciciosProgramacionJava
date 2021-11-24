/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3ejercicios;
import java.util.Scanner;
/**
 *
 * @author carra
 */
public class Calculadora {
    public static void main(String[] args) {
        //variables
        double a, b;
        int opcion;
        boolean salir = false;
        
        //Scanner
        Scanner entrada = new Scanner(System.in);
        
            
        
                //pedimos números y damos opciones
         
            System.out.println("Elige uan opción\n1.Sumar A+B\n" +
                "2. Restar A-B\n" +
                "3. Multiplicar A*B\n" +
                "4. Dividir A/B\n" +
                "5. Resto A%B\n" +
                "6. Exponencial A^B\n" +
                "7. Seno(X)\n" +
                "8. Coseno(X)\n" +
                "9. Tangente(X)\n" +
                "10. Salir");
           
            opcion = entrada.nextInt();
            
            
            

            switch (opcion) {
                case 1: 
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("Introduce otro número decimal");
                    b = entrada.nextDouble();
                    System.out.println("La suma es: "+(a+b));
                    break;
                case 2:
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("Introduce otro número decimal");
                    b = entrada.nextDouble();
                    System.out.println(a+" - " +b+" = "+(a-b));
                    break;
                case 3:
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("Introduce otro número decimal");
                    b = entrada.nextDouble();
                    System.out.println(a+" * " +b+" = "+(a*b));
                    break;
                case 4:
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("Introduce otro número decimal");
                    b = entrada.nextDouble();
                    System.out.println(a+" / " +b+" = "+(a/b));
                    break;
                case 5:
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("Introduce otro número decimal");
                    b = entrada.nextDouble();
                    System.out.println(a+" % " +b+" = "+(a%b));
                    break;
                case 6:
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("Introduce otro número decimal");
                    b = entrada.nextDouble();
                    System.out.println("pow(a,b) es "+ Math.pow(a, b));
                    break;
                case 7:
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("El seno de " + a + " es: " + Math.sin(a));
                    break;
                case 8:
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("El coseno de " + a + " es: " + Math.cos(a));
                    break;
                case 9:
                    System.out.println("Introduce un número decimal");
                    a = entrada.nextDouble();
                    System.out.println("La tangente de " + a + " es: " + Math.tan(a));
                    break;
                case 10:
                    salir = true;
                    break;
                default:
                    System.err.println("Las opciones son entre 1 y 10");
                    
            }
        
        }
    }
    
