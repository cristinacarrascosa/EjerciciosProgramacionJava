package Ud6.POO.Ejercicios2.Reloj;

public class Reloj {

    // Atributos privados
    private int hora, minuto, segundo;

    // Constructores
    public Reloj() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Reloj(int hora, int minuto, int segundo) {

        if (hora > 23 || hora < 0) {
            System.err.println("Error en la hora");
        } else {
            this.hora = hora;
        }
        if (minuto > 59 || minuto < 0) {
            System.err.println("Error en los minutos");
        } else {
            this.minuto = minuto;
        }
        if (segundo > 59 || minuto < 0) {
            System.err.println("Error en los segundos");
        } else {
            this.segundo = segundo;
        }

    }
    // getters

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Setters
    public void setReloj(int hora, int minuto, int segundo) {
        if (hora > 24 || hora < 0) {
            System.err.println("DIGITOS DE HORA INCORRECTOS");
        } else {
            this.hora = hora;
        }
        if (minuto > 59 || minuto < 0) {
            System.err.println("DIGITOS DE MINUTO INCORRECTOS");
        } else {
            this.minuto = minuto;
        }
        if (segundo > 59 || minuto < 0) {
            System.err.println("DIGITOS DE SEGUNDO INCORRECTOS");
        } else {
            this.segundo = segundo;
        }
    }

    // Métodos dime hora
    public String dimeHora(int hora, int minuto, int segundo) {
        if (hora > 24 || hora < 0 || minuto > 59 || minuto < 0 || segundo > 59 || segundo < 0) {
            System.err.println("DIGITOS INCORRECTOS, REVISA LA HORA");
        } else {
            this.hora = hora;
            this.segundo = segundo;
            this.minuto = minuto;
        }
        String dimeHora = hora + ":" + minuto + ":" + segundo;
        return dimeHora;

    }

    public String dimeHora12(int hora, int minuto, int segundo) {
        if (hora > 24 || hora < 0 || minuto > 59 || minuto < 0 || segundo > 59 || segundo < 0) {
            System.err.println("DIGITOS INCORRECTOS, REVISA LA HORA");
        } else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }

        String dimeHora;

        if (hora > 12) {
            dimeHora = hora - 12 + "pm:" + minuto + ":" + segundo;
        } else {
            dimeHora = hora + "am:" + minuto + ":" + segundo;
        }
        return dimeHora;
    }
    // Métodos imprimir

    public void imprimeHora() {
        System.out.println(dimeHora(hora, minuto, segundo));
    }

    public void imprimeHora12() {
        System.out.println(dimeHora12(hora, minuto, segundo));
    }

    public void tick() {

        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
        }
        if (minuto == 60) {
            minuto = 0;
            hora = (hora + 1);
        }
    }

}
