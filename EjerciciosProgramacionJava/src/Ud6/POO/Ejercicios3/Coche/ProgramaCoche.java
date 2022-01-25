package Ud6.POO.Ejercicios3.Coche;

import java.util.Scanner;


public class ProgramaCoche {

    public static void main(String[] args) {
        // Creamos Scanner
        Scanner sc = new Scanner(System.in);
        // Variables
        int metalizado = 0, antes2000 = 0, terceros = 0, todoRiesgo = 0, valor;

        // Creamos array de objetos de la clase Coche
        Coche arrayObjetos[] = new Coche[2];

        //Pedimos datos
        for (int i = 0; i < arrayObjetos.length; i++) {
            System.out.println("Modelo?");
            String modelo = sc.nextLine();
            
            System.out.println("Color?");
            String color = sc.nextLine();
            
            System.out.println("Pintura metalizada?");
            boolean pinturaMetalizada = sc.nextBoolean();
            
            if (pinturaMetalizada == true) {
                metalizado++;
            }
            
            sc.nextLine();
            
            System.out.println("Matrícula?");
            String matricula = sc.nextLine();
            
            System.out.println("Año fabricación?");
            int anyoFabricacion = sc.nextInt();
            if (anyoFabricacion < 2000) {
                antes2000++;
            }
            
            do {
                System.out.println("Elige número según tipo de coche: 1.MINI, 2.UTILITARIO, 3.FAMILIAR, 4.DEPORTIVO.");
                valor = sc.nextInt();
            } while (valor < 1 || valor > 4);

            Coche.tipoCoche t = null;
            switch (valor) {
                case 1:
                    t = Coche.tipoCoche.MINI;
                    break;
                case 2:
                    t = Coche.tipoCoche.UTILITARIO;
                    break;
                case 3:
                    t = Coche.tipoCoche.FAMILIAR;
                    break;
                case 4:
                    t = Coche.tipoCoche.DEPORTIVO;
                    break;
                default:
                    System.err.println("NÚMERO ERRÓNEO");
                    break;
            }
            
            do {
                System.out.println("Elige el número de la modalidad del seguro: 1.TERCEROS, 2.TODO_RIESGO");
                valor = sc.nextInt();
            } while (valor < 1 || valor < 2);

            Coche.modalidadSeguro s = null;
            switch (valor) {
                case 1:
                    s = Coche.modalidadSeguro.TERCEROS;
                    terceros++;
                    break;
                case 2:
                    s = Coche.modalidadSeguro.TODO_RIESGO;
                    todoRiesgo++;
                    break;
                default:
                    System.err.println("NÚMERO ERRÓNEO");
                    break;

            }
            arrayObjetos[i] = new Coche(modelo, color, pinturaMetalizada, matricula, anyoFabricacion, Coche.tipoCoche.MINI, Coche.modalidadSeguro.TERCEROS);
            sc.nextLine();
            System.out.println("-----------------------------");
        }
        for (Coche arrayObjeto : arrayObjetos) {
            arrayObjeto.imprime();
        }
        System.out.println("Coches con pintura metalizada: " + metalizado);
        System.out.println("Fabricado antes del 2000: " + antes2000);
        System.out.println("Seguro a terceros: " + terceros);
        System.out.println("Seguro todo riesgo: " + todoRiesgo);
    }

}
