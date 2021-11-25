
package CursoJava;


public class ManipulaCadenas {
    
    public static void main(String[] args) {
        
        String nombre= "Felipe Juan Froilan de Todos los Santos";
        
        
        System.out.println("Mi nombre es "+nombre);
        
        System.out.println("Mi nombre tiene "+nombre.length()+" letras.");
        
        System.out.println("La primer letra de "+nombre+" es la "+nombre.charAt(0));//nos devolverá la leta que está en esa posición
        
        int ultima_letra;
        
        ultima_letra=nombre.length();
        //esto lo hacemos para que cuente las letras
        
        System.out.println("Y la última letra es la "+nombre.charAt(ultima_letra-1));
        //esto nos devolverá la última letra de nuestro número, charAt nos devuelve el caracter en esa posición
        
        
        
        
    }
}
