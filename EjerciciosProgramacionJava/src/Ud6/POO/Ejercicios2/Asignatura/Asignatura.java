package Ud6.POO.Ejercicios2.Asignatura;

public class Asignatura {

    // Atributos privados
    private String nombre;
    private int codigo;
    private int curso;

    
    // Constructor
    public Asignatura(String n, int c, int cur) {

        this.nombre = n;
        this.codigo = c;
        this.curso = cur;

    }
    
    // Getters
    public String getNom(){
        return nombre;
    }
    public int getCodigo (){
        return codigo;
    }
    public int getCurso(){
        return curso;
    }
    
    // Setters
    public void setNom(String n){
        this.nombre = n;
    }
    public void setCodigo(int cod){
        this.codigo = cod;
    }
    public void setCurso(int cur){
        this.curso = cur;
    }
    
    // Métodos
    public void imprime(){
        
        System.out.println("Nombre: "+nombre+" código: "+codigo+" curso: "+curso);
    }
}
