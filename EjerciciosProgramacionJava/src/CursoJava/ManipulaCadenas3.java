
package CursoJava;


public class ManipulaCadenas3 {

    public static void main(String[] args) {
        
        String alumno1, alumno2;
        
        alumno1="David";
        
        alumno2="david";
        
        //System.out.println(alumno1.equals(alumno2));
        //compara las dos variables y devuelve true si es verdadera
        //distingue entre mayúsculas y minúsculas
        
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        //hace lo mismo que el de arriva pero ignora las mayúsculas
    }
}
