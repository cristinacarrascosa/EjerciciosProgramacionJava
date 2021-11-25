
package CursoJava;


public class ManipulaCadenas2 {

    public static void main(String[] args) {
        
       //método substring para extraer una cadena de caracteres
       
        String frase="Hoy es un estupendo día para aprender a programar en Java";
        
        //creamos una variable objeto de tipo String
        //String frase_resumen=frase.substring(29,57);//devuel la cadena de caracteres que le indiquemos
        //substring(x,y)x=empieza a devolver desde ahí, y=acaba ahí y este no lo devuelve
        
        //en este ejemplo aprendemos a concatenar con substring
        String frase_resumen=frase.substring(0, 29) + " irnos a la playa y olvidarnos de todo..." + " y " +
        frase.substring(29, 57);
        System.out.println(frase_resumen);
    }
}
