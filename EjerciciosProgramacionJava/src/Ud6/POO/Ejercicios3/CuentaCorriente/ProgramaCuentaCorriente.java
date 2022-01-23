package Ud6.POO.Ejercicios3.CuentaCorriente;

import java.util.Scanner;

public class ProgramaCuentaCorriente {

    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Creamos vector
        CuentaCorriente arrayCuentas[] = new CuentaCorriente[5];

        // Llenamos el vector
        arrayCuentas[0] = new CuentaCorriente(456123789, 1000);
        arrayCuentas[1] = new CuentaCorriente(456123123, 2000);
        arrayCuentas[2] = new CuentaCorriente(456123456, 3000);
        arrayCuentas[3] = new CuentaCorriente(789123789, 4000);
        arrayCuentas[4] = new CuentaCorriente(456456456, 5000);

        // Variables 
        int opcion, posicion, cuenta;
        boolean salir = false;
        double cantidad = 0;

        do {
            System.out.println("*********** OPCIONES *********");
            System.out.println("1.Ver cuentas");
            System.out.println("2.Ingresar");
            System.out.println("3.Retirar");
            System.out.println("4.Transferencia");
            System.out.println("5.Salir");

            System.out.println("ELIGE OPCIÓN");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 5){
                System.err.println("OPCIÓN INCORRECTA");
            }else
            

            switch (opcion) {
                case 1:
                    System.out.println("LISTA DE CUENTAS");
                    for (int i = 0; i < arrayCuentas.length; i++) {
                        arrayCuentas[i].imprime();
                        System.out.println("--------------------------------");

                    }
                    break;

                case 2:
                    System.out.println("-------------- INGRESO ---------");
                    System.out.println("ELIGE LA CUENTA A INGRESAR ENTRE 0 Y 4");
                    posicion = sc.nextInt();

                    if (posicion < 0 || posicion >= 5) {
                        System.err.println("POSICION DE CUENTA INCORRECTA");

                    } else {
                        System.out.println("Introduce la cantidad a ingresar");
                        cantidad = sc.nextDouble();
                        arrayCuentas[posicion].ingresar(cantidad);
                        arrayCuentas[posicion].imprime();
                    }
                    break;

                case 3:
                    System.out.println("-------------- RETIRAR ---------");
                    System.out.println("ELIGE LA CUENTA A RETIRAR ENTRE 0 Y 4");
                    posicion = sc.nextInt();

                    if (posicion < 0 || posicion >= 5) {
                        System.err.println("POSICION DE CUENTA INCORRECTA");

                    } else {
                        System.out.println("Introduce la cantidad a retirar");
                        cantidad = sc.nextDouble();
                        arrayCuentas[posicion].retirar(cantidad);
                        arrayCuentas[posicion].imprime();
                    }
                    break;
                case 4:
                    System.out.println("--------- TRANSFERENCIA -----------");
                    System.out.println("Introduce poscion de cuenta a extraer entre 0 y 4");
                    posicion = sc.nextInt();
                    if (posicion < 0 || posicion >= 5) {

                        System.err.println("POSICIÓN INCORRECTA");

                    } else {
                        System.out.println("Introduce la cantidad a transferir");

                        cantidad = sc.nextDouble();
                        arrayCuentas[posicion].retirar(cantidad);
                        arrayCuentas[posicion].imprime();
                        System.out.println("Introduce la posicion de la cuenta a transferir");
                        posicion = sc.nextInt();
                        arrayCuentas[posicion].ingresar(cantidad);
                        arrayCuentas[posicion].imprime();

                    }

                    break;

                case 5:
                    salir = true;
                    break;
            }

        
    }
    while (!salir);
    }

}
