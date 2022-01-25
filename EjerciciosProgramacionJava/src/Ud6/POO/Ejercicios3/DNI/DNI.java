package Ud6.POO.Ejercicios3.DNI;

public class DNI {

    // ATRIBUTOS
    private int dni;
    private static final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    // CONSTRUCTOR
    public DNI(int dni) {
        this.dni = dni;
    }

    // GETTERS
    public int getDNI() {
        return this.dni;
    }

    public char getLetra() {
        return letras.charAt(dni % 23);
    }

    public String getNIF() {
        return ("" + dni + getLetra());
    }

    // SETTERS
    public void setDNI(int dni) {
        this.dni = dni;
    }

    // OTROS MÉTODOS
    public void imprime() {
        System.out.println(getNIF());
    }

    public static DNI newRandomDni() {
        int numeroRandom = (int) (Math.random() * (99999999 - 00000000 + 1) + 00000000);
        DNI DniRandom = new DNI(numeroRandom);
        return DniRandom;
    }

}
