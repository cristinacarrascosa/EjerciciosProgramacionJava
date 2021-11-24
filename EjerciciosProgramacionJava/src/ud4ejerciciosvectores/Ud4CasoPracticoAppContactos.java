/*
 * Proyecto Ud4CasoPracticoAppContactos - Archivo Ud4CasoPracticoAppContactos.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ud4ejerciciosvectores;

import java.util.*;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 11 nov. 2021 19:33:35
 */
public class Ud4CasoPracticoAppContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int MAX = 100;
        boolean salir = false;
        double[] telefonos = new double[MAX];
        String[] nombres = new String[MAX];
        String[] correos = new String[MAX];
        int cuantos = 0;
        
        do{
            
        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Buscar contacto");
        System.out.println("5. Salir");
        System.out.println("Elige un opción");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                for (int i = 0; i < cuantos; i++) {
                    System.out.println("Nombre: " + i + ": " + nombres[i]);
                    
                }
                    for (int j = 0; j < cuantos; j++) {
                        System.out.println("Telf: " + j + ": " + telefonos[j]);
                        
                    }
                        for (int k = 0; k < cuantos; k++) {
                            System.out.println("Mail: " + k + ": " + correos[k]);
                            
                        }
                        cuantos ++;
                break;

            case 2:
                
                System.out.println("Introduce teléfono");
                telefonos [cuantos]= sc.nextDouble();
                sc.nextLine();
                System.out.println("Introduce nombre: ");
                nombres [cuantos]= sc.nextLine();
                System.out.println("Introduce el e-mail");
                correos [cuantos]= sc.nextLine();
                cuantos ++;
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;
        }
             
        
            
        }
        while(!salir);
        

    }

}
