package ud3ejercicios;

public class ud3_2 {
    public static void main (String[] args) {
        
        /*Escribe un programa que pide la edad por teclado y nos muestra el mensaje 
        de “Eres mayor de edad” o el mensaje de “Eres menor de edad”.*/
        
        int edad;
            java.util.Scanner lector = new java.util.Scanner(System.in);
            System.out.print("Introduce tu edad ");
            edad = lector.nextInt();
            
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");}
            else if (edad < 18){//hay que acordarse del parentesis
                System.out.println("Eres menos de edad");}
    }
}