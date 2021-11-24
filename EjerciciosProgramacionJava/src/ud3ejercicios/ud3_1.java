package ud3ejercicios;

public class ud3_1 {
        public static void main (String[] args) {
            /*scribe un programa que pide la edad por teclado y muestre el 
            mensaje de “Eres mayor de edad” si lo somos.*/
            
            //Variables
            int edad;
            java.util.Scanner lector = new java.util.Scanner(System.in);
            System.out.print("Introduce tu edad ");
            edad = lector.nextInt();
            
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            
        

        }
}
}
