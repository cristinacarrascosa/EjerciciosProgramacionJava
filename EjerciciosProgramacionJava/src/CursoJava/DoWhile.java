/*
 * Este programa calcula el peso ideal según si eres hombre o mujer
 */
package CursoJava;

import javax.swing.*;

/**
 *
 * @author carra
 */
public class DoWhile {

    public static void main(String[] args) {

        String genero = "";

        do {//en el caso de que introduzcamos valores diferentes a los indicados,
            //seguirá salientdo el JOptionPane
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M"));
        //aquí va la condición, mientras la respuesta no sea h o m
       //mientras lo que el usuario haya introducido en a ventana de JOption se repetirá
    //con el operador lógico && le decimos que tiene que cumplir las dos cosas
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
        int pesoideal = 0;//inicializamos la variable

        if(genero.equalsIgnoreCase ( 
        "H")){//si es un hombre
            pesoideal = altura - 110;
    }

        else if (genero.equalsIgnoreCase ("M")){
            pesoideal = altura - 120;
    }System.out.println("Tu peso ideal es "+pesoideal);
        
    }
}
