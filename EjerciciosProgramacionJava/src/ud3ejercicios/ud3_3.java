package ud3ejercicios;

public class ud3_3 {
    public static void main (String[] args) {
        /*Escribe un programa que pida 2 números enteros y muestre el mayor.*/
        int n1, n2, max;
        
        java.util.Scanner lector = new java.util.Scanner(System.in);
        System.out.println("Intorduce un número");
        n1 = lector.nextInt();
        
        System.out.println("Introduce otro número");
        n2 = lector.nextInt();
        
        
        if (n1 > n2) {
            System.out.println(n1+" es mayor que " + n2);
        }
        else if (n2 > n1){
            System.out.println(n2 + " es mayor que "+ n1) ;
        }   
        else {
            System.out.println(n1 +" es igual a " + n2);
        }
    }
        
}        
    

