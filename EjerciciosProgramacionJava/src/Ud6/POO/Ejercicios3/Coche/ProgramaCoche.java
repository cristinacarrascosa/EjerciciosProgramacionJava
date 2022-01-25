
package Ud6.POO.Ejercicios3.Coche;

import java.util.Scanner;

/*
Escribe un programa que haga lo siguiente:
1. Pedir por teclado los datos de 3 coches y guardarlos en un vector de coches.
2. Imprimir por pantalla lo siguiente:
1. La información de todos los coches. Añade a la clase Coche el método imprimir().
2. Cuantos coches tienen la pintura metalizada.
3. Cuantos coches fueron fabricados antes del año 2000.
4. Cuantos coches tienen cada modalidad de seguro (a terceros y a todo riesgo).
*/



public class ProgramaCoche {
    
    public static void main(String[] args) {
        // Creamos Scanner
        Scanner sc = new Scanner(System.in);
        // Variables
        int metalizado=0, antes2000=0, terceros=0, todoRiesgo=0;
        
        
        // Creamos array de objetos de la clase Coche
        Coche arrayObjetos[]= new Coche [3];
        
        //Pedimos datos
        for (int i = 0; i < arrayObjetos.length; i++) {
            System.out.println("Modelo?");
            String modelo = sc.nextLine();
            System.out.println("Color?");
            String color = sc.nextLine();
            System.out.println("Pintura metalizada?");
            boolean pinturaMetalizada = sc.nextBoolean();
            if(pinturaMetalizada == true){
                metalizado++;
            }
            System.out.println("Matrícula?");
            String matricula=sc.nextLine();
            System.out.println("Año fabricación?");
            int anyoFabricacion = sc.nextInt();
            if(anyoFabricacion < 2000){
                antes2000++;
            }
            System.out.println("Elige número según tipo de coche: 1.MINI, 2.UTILITARIO, 3.FAMILIAR, 4.DEPORTIVO.");
            int tipoCoche = sc.nextInt();
            switch (tipoCoche) {
                case 1:
                    setTipo(tipoCoche.MINI);
                    break;
                case 2:
                    arrayObjetos[i].setTipo(Coche.tipoCoche.UTILITARIO);
                    break;
                case 3:
                    arrayObjetos[i].setTipo(Coche.tipoCoche.FAMILIAR);
                    break;
                case 4:
                    arrayObjetos[i].setTipo(Coche.tipoCoche.DEPORTIVO);
                    break;
                default:
                    System.err.println("NÚMERO ERRÓNEO");
                    break;
            }
            System.out.println("Elige el número de la modalidad del seguro: 1.TERCEROS, 2.TODO_RIESGO");
            int seguro = sc.nextInt();
            switch (seguro) {
                case 1:
                    arrayObjetos[i].setSeguro(Coche.modalidadSeguro.TERCEROS);
                    terceros++;
                    break;
                case 2:
                    arrayObjetos[i].setSeguro(Coche.modalidadSeguro.TODO_RIESGO);
                    todoRiesgo++;
                    break;
                default:
                    System.err.println("NÚMERO ERRÓNEO");
                    break;
                    
            }
            arrayObjetos[i]= new Coche(modelo, color, pinturaMetalizada, matricula, anyoFabricacion, Coche.tipoCoche.MINI, Coche.modalidadSeguro.TERCEROS);
        }
        for (Coche arrayObjeto : arrayObjetos) {
            arrayObjeto.imprime();
        }
        
    }
    
}
