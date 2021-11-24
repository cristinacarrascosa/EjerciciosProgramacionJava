package ud3ejercicios;

public class ud3_4 {
    public static void main (String[] args) {
        /*Escribe un programa que pida un número y me dice si es positivo 
        o negativo.Consideraremos el cero como positivo.*/
        
        int n1;
        
        java.util.Scanner lector = new java.util.Scanner(System.in);
        System.out.println("Intorduce un número");
        n1 = lector.nextInt();
        
        if (n1 >=
        0) {
        System.out.println("El número " + n1 + " es positivo");
        }
        else {
        System.out.println("El número " + n1 + " es negativo");
        }
        
        


    }
}