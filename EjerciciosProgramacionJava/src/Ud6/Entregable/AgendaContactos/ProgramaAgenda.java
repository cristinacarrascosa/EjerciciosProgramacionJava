package ud6.Entregable.AgendaContactos;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaAgenda {

    public static void menu() {
        System.out.println("********** ELIGE UNA OPCIÓN ********");
        System.out.println("1.Ver contactos.");
        System.out.println("2.Agregar contacto.");
        System.out.println("3.Eliminar contacto.");
        System.out.println("4.Buscar por nombre.");
        System.out.println("5.Buscar por teléfono.");
        System.out.println("6.Buscar por correo.");
        System.out.println("7.Búsqueda global.");
        System.out.println("8.SALIR");
    }

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        Agenda nueva = new Agenda();

        //Variables
        boolean salir = false;

        do {
            menu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-------- VER CONTACTOS -----------");
                    nueva.verContacto();
                    break;
                case 2:
                    System.out.println();
                    sc.nextLine();
                    System.out.println("----- AGREGAR CONTACTO ------");

                    System.out.println("Introduce nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce teléfono");
                    String tlf = sc.nextLine();
                    System.out.println("Introduce email");
                    String email = sc.nextLine();
                    nueva.agregarContacto(nombre, tlf, email);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("------ ELIMINAR CONTACTO ------");
                    sc.nextLine();
                    nueva.verContacto();
                    System.out.println("Introduce el número de contacto a eliminar");
                    int posicion = sc.nextInt();
                    nueva.eliminarContacto(posicion);
                    
                    break;
                case 4:
                    System.out.println();
                    System.out.println("------ BUSCAR POR NOMBRE --------");
                    sc.nextLine();
                    System.out.println("Introduce el nombre a buscar");
                    nombre = sc.nextLine();
                    nueva.buscarNombre(nombre);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("--------- BUSCAR POR TELÉFONO -------");
                    sc.nextLine();
                    System.out.println("Introduce el teléfono a buscar");
                    tlf = sc.nextLine();
                    nueva.buscarTlf(tlf);
                    break;
                case 6:
                    System.out.println();
                    System.out.println("------ BUSCAR POR E-MAIL ----------");
                    sc.nextLine();
                    System.out.println("Introduce el e-mail a buscar");
                    email = sc.nextLine();
                    nueva.buscarEmail(email);
                    
                    break;
                case 7:
                    System.out.println();
                    System.out.println("---------- BÚSQUEDA GLOBAL ---------");
                    sc.nextLine();
                    System.out.println("Introduce cadena a buscar");
                    String t = sc.nextLine();
                    nueva.bucaGlobal(t);
                    break;
                case 8:
                    System.out.println("--------- HASTA LUEGO!! ----------");
                    salir = true;
                    break;

            }
        } while (salir == false);
    }

}
