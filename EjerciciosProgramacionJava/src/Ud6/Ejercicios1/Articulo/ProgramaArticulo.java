/*
 * Proyecto EjerciciosProgramacionJava - Archivo ProgramaArticulo.java - Compañía DAW
 * License Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package Ud6.Ejercicios1.Articulo;

/**
 *
 * @author Cristina Carrascosa Torres <cctausias@gmail.com>
 * @version 1.0
 * @date 12 ene. 2022 17:22:42
 */
public class ProgramaArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MIRAR POR QUE NO COJE EL IVA
        Articulo a1 = new Articulo("pijama", 15, 21, 10);
        
                
        System.out.println(a1.n()+": "+a1.p()+" euros");
        System.out.println("IVA: "+a1.iva()+" - PVP: "+(a1.p()+(a1.p()*a1.iva()/100)));
    }

}
