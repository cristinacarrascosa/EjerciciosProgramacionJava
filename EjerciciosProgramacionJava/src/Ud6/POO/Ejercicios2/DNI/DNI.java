
package Ud6.POO.Ejercicios2.DNI;


public class DNI {
    
    // Atributos
    private int numeroDni;
    
    // Setter
    public void setDni(int dni){
        this.numeroDni = dni;
    }
    // Métodos getter
    public int getDni(){
        return numeroDni;
    } 
    
    public char getLetra(){
        char letra = 0;
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        int resto;
        resto = numeroDni % 23;
        for (int i = 0; i < letras.length; i++) {
            letra = letras[resto];
        }
        return letra;
        
    }
    
    public String getNIF(){
        return Integer.toString(numeroDni)+getLetra();
    }
    
    public void imprime(){
        System.out.println(getNIF());
    }
}
