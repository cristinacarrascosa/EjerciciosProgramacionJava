
package CursoJava;


public class OperadoresClaseMath {
    
    public static void main(String[] args) {//todo programa en java debe tener un metodo main
        //todo programa java debe estar compuesto al menos de una clase
        //clases propias, las que creamos notros
        //clases predefinidas, estan ya construidas, se nos suministran para poderlas utilizar en java.
        //API java, biblioteca donde vienen todas las clases de java
        
        //double raiz = Math.sqrt(9); //nos sacará la raiz cuadrada de 9 y debe ser de tipo double
        
        //float num1=5.85F; cuando declaramos una variable de tipo float tenemos que ponerle la F
        
        double base= 5;
        double exponenete=3 ;
        
        int resultado=(int)Math.pow(base, exponenete);//eleva a un numero
        //devuelve una variable de tipo double
        //por esto haremos una refundición y lo convertimos a int
        
                
                
        //int resultado=(int)Math.round(num1);//redondea
        //devuelve una variable de tipo long y no se puede almacenar en un int, en un float o int si se puede
        //haremos una refundición para que se puede almacenar en un int
        //para eso escribimos entre parentesis al tipo de datos que lo queremos convertir
        
        
        
        System.out.println("El resultado de "+base+" elevado a "+exponenete+" es "+resultado);
    }
    
}
