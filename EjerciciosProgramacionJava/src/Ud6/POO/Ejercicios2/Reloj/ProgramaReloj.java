package Ud6.POO.Ejercicios2.Reloj;

public class ProgramaReloj {

    public static void main(String[] args) {

        Reloj r1 = new Reloj();

        r1.dimeHora(23, 0, 0);

        r1.imprimeHora();

        Reloj r2 = new Reloj();

        r2.dimeHora12(22, 59, 59);
        r2.imprimeHora12();
        r2.tick();
        r2.imprimeHora12();

    }
}
