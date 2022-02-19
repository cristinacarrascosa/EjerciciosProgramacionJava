package Ud7.POO.Entregable.Banco;

import java.util.Scanner;

public class ProgramaBanco {

    public static void menu() {
        System.out.println("******* SELECCIONA UNA OPCIÓN DEL MENÚ *********");
        System.out.println("");
        System.out.println("1. Ver cuentas");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Trasnferencia");
        System.out.println("5. Agregar cuenta");
        System.out.println("6. Eliminar cuenta");
        System.out.println("7. Buscar cuenta");
        System.out.println("8. Mostrar morosos");
        System.out.println("9. Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        do {
            menu();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-------- VER CUENTAS --------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("-------- INGRESAR DINERO -------");
                    System.out.println("");
                    break;
                case 3:
                     System.out.println("-------- RETIRAR DINERO --------");
                     System.out.println("");
                    break;
                case 4:
                     System.out.println("-------- TRANSFERENCIA --------");
                     System.out.println("");
                    break;
                case 5:
                     System.out.println("-------- AGREGAR CUENTA --------");
                     System.out.println("");
                    break;
                case 6:
                     System.out.println("-------- ALIMINAR CUENTA --------");
                     System.out.println("");
                    break;
                case 7:
                     System.out.println("-------- BUSCAR CUENTA --------");
                     System.out.println("");
                    break;
                case 8:
                     System.out.println("-------- MOSTRAR MOROSOS --------");
                     System.out.println("");
                    break;
                case 9:
                     System.out.println("-------- SALIR --------");
                     System.out.println("Hasta la vista! :)");
                     salir = true;
                    break;
            }
        } while (salir == false);
    }

}
