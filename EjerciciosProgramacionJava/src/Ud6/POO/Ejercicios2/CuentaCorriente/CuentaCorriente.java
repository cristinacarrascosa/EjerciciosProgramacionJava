
package Ud6.POO.Ejercicios2.CuentaCorriente;


public class CuentaCorriente {
    
    //Atributos privados
    private long numCuenta;
    private double saldo;
    
    //Constructor
    public CuentaCorriente(long nCuenta, double saldo){
        
        if(saldo < 0){
            System.err.println("No se permiten cuentas con saldo negativo!");
        }else{
        this.numCuenta = nCuenta;
        this.saldo = saldo;
        }
    }
    
    //Getters
    public long getNCuenta(){
        return numCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    
    //Setters
    public void nCuenta(long nCuenta){
        this.numCuenta = nCuenta;
    }
    public void saldo(double saldo){
        this.saldo = saldo;
    }
    
    //Métodos
    public void ingresar(double ingreso){
        if (ingreso >= 0){
            saldo += ingreso;
            System.out.println("Número cuenta: "+numCuenta+" -- Saldo: "+saldo);
            
        }else{
            System.err.println("No se puede ingresar una cantidad negativa!!");
        }
    }
    public boolean retirar(double efectivo){
          
        boolean reintegroCorrecto = true;                                                                         
        if (efectivo < 0) {
            
            reintegroCorrecto = false;
            System.err.println("Cantidad negativa -- Reintegro: "+reintegroCorrecto);
        } else if (saldo >= efectivo) {
            
            saldo -= efectivo;
            System.out.println("Número cuenta: "+numCuenta+" -- Saldo: "+saldo+" -- Reintegro: "+reintegroCorrecto);
        } else {
            
            reintegroCorrecto = false;
            System.err.println("Saldo insuficiente!! -- Reintegro: "+reintegroCorrecto);
        }
        
        return reintegroCorrecto;
    }
    
    
}
