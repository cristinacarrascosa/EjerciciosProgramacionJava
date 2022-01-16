
package Ud6.POO.Ejercicios2.Coche;

import java.awt.Color;

    enum Tipo{
       
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO;
        
      
    }
    
    enum Seguro{
        
        TERCEROS, TODO_RIESGO;
    }

public class Coche {
    
    // Tipos enumerados
    
    
    // Atributos privados
    private String modelo;
    private Color color;
    private boolean metalizada;
    private String matricula;
    private int añoFabricacion;
    private final Tipo tipo;
    private final Seguro seguro;
    
    // Constructor
    public Coche(String modelo, Color color, String matricula, boolean metalizada, int año, Tipo tipo, Seguro seguro){
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.añoFabricacion = año;
        this.tipo = tipo;
        this.seguro = seguro;
        
       
    }
    
    // Getters
    public String getModelo(){
        return modelo;
    }
    public Color getColor(){
        return color;
    }
    public String getMatricula(){
        return matricula;
    }
    public boolean getmetaliza(){
        return metalizada;
    }
    public int getAño(){
        return añoFabricacion;
    }
    public Tipo getTipo(){
        return tipo;
    }
    public Seguro getSeguro (){
        return seguro;
    }
   
    
    // Setters
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setMetalizada(boolean metalizada){
        this.metalizada = metalizada;
    }
    public void setAño(int año){
        this.añoFabricacion = año;
    }
    
    
    
    
    // Métodos
    public void imprime(){
        System.out.println("MODELO: "+modelo+" - COLOR: "+color+" - PINTURA METALIZADA: "+metalizada+" - MATRÍCULA: "+matricula+" - AÑO DE FABRICACIÓN: "+añoFabricacion+" - Tipo: "+tipo+" - SEGURO: "+seguro);
        
    }
    
    
}
