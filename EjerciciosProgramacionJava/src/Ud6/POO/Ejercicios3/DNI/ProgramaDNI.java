package Ud6.POO.Ejercicios3.DNI;



public class ProgramaDNI {

    public static void main(String[] args) {
        int dniA = 0,dniE=0, dniI = 0, dniO = 0, dniU = 0;
        
        DNI[] arrayDni = new DNI[10000];
        for (int i = 0; i < arrayDni.length; i++) {
            arrayDni[i] = DNI.newRandomDni();
            arrayDni[i].imprime();

            switch (arrayDni[i].getLetra()) {
                case 'A':
                    dniA++;
                    break;
                case 'E':
                    dniE++;
                    break;
                case 'I':
                    dniI++;
                    break;
                case 'O':
                    dniO++;
                    break;
                case 'U':
                    dniU++;
                    break;
            }

        }
        System.out.println("Total A: " + dniA);
        System.out.println("Total E: " + dniE);
        System.out.println("Total I: " + dniI);
        System.out.println("Total O: " + dniO);
        System.out.println("Total U: " + dniU);

    }

}

