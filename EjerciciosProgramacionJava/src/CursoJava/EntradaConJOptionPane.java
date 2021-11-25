package CursoJava;
//1º el paquete al que pertenece

import javax.swing.*;
//2ºel paquete que queremos importar, y la clase, si queremos especificarla



//son todos staticos, no tendremos que crearnos un objetola clase como en el Scanner
//lo usamos como en la clase Math

public class EntradaConJOptionPane {
    
    public static void main(String[] args) {
        
        String nombreUsuario=JOptionPane.showInputDialog("Introduce tu nombre por favor");
        //Almacena una variable de tipo String
        String edad=JOptionPane.showInputDialog("introduce la edad, por favor");
        //OJO aqui estamos pidiendo un dato de tipo int y lo vamos a almacenar en un String
        
        
        //para poder realizar operaciones con el objeto edad, tenemos que convertirlo en un entero
        //lo haremos con parseInt(edad) y es método de la clase Integer
        //es estático, por lo que tendremos que utilizar el nombre de la clase delante de método
        int edadUsuario= Integer.parseInt(edad);
        //con esto lo que hay en el string edad lo pasa a entero
        
        //incrementamos en 1 el valor de edadUsuario
        edadUsuario++;
        
        
        //mostramos en consola
        System.out.println("Hola "+nombreUsuario+ ". El año que viene tendrás "+edadUsuario+" años.");
        
        
        
    }
            
    
}
