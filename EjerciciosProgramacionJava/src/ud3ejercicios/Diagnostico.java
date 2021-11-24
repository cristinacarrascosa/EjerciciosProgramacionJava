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
public class Diagnostico {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int riesgoIni = 5;
        boolean salir = false;
        int opcion;
        int contador = 0;
        double efectoMultiplicador;
        double riesgoFinal;
        //Scanner
        Scanner entrada = new Scanner(System.in);
        //motramos las opciones 
        
        while(!salir) {
            System.out.println("Fatores de riesgo");
            
            
            
            //mostrar el litado, leer y guardar
            System.out.println("1= Presión arterial alta\n2= Colesterol elevado\n3= diabetes\n4= Obesidad\n5= Tabaquismo\n6= Inactividad física\n7= Sexo masculino\n8= Familiares con enfermadades del corazón\n9= Edad superior a 55 años\n10= Salir\nEn caso afirmativo introduzca el número correspondiente: ");
            opcion = entrada.nextInt();
            //Creo el switch
                switch (opcion) {
                    case 1: case 2:
                        riesgoIni = riesgoIni+ 15;
                        contador = contador + 1;
                        break;
                    case 3: case 4: case 5: case 6:
                        riesgoIni = riesgoIni +10;
                        contador = contador + 1;
                        break;
                    case 7: case 8: case 9:
                        riesgoIni = riesgoIni +5;
                        contador = contador + 1;
                        break;
                    case 10:
                        salir = true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 10");
                }
            
        }
        
        System.out.println("El riesgo inicial es: "+ riesgoIni);
        
                if (contador == 2) {
                    efectoMultiplicador = 1.25;
                } else if (contador == 3 || contador == 4){
                    efectoMultiplicador = 1.5;
                } else if (contador == 5 || contador == 6){ 
                    efectoMultiplicador = 1.75;
                } else if (contador == 7 || contador == 8){ 
                    efectoMultiplicador = 2.00;
                } else if (contador ==9) { 
                    efectoMultiplicador = 2.50;  
                } else {
                    efectoMultiplicador = 1.00;
                }
                
        System.out.println("Efecto Multiplicador es: " + efectoMultiplicador);
        
                riesgoFinal = riesgoIni * efectoMultiplicador;
        System.out.println("El riesgo final es: " + riesgoFinal);
    } 
}
        
            
                
            
        
    
    
