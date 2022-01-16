/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ud6.POO.Ejercicios2.Asignatura;

/**
 *
 * @author carra
 */
public class ProgramaAsignatura {

    public static void main(String[] args) {

        // Objetos
        Asignatura a1 = new Asignatura("Matemáticas", 1017, 1);
        Asignatura a2 = new Asignatura("Lengua inglesa", 1018, 2);
        Asignatura a3 = new Asignatura("Castellano", 1019, 3);

        
        // Utilizamos los métodos
        a1.imprime();
        a2.imprime();
        a3.imprime();
        
    }

}
