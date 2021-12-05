/*
 * 1. Crea un programa que lea una frase por teclado e indique si la frase es un palíndromo
    o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
    Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
    acentos, etc.). NOTA: Un palíndromo es un texto que se lee igual de izquierda a
    derecha que de derecha a izquierda. Por ejemplo:
◦ Amigo no gima
◦ Dabale arroz a la zorra el abad
◦ Amo la pacífica paloma
◦ A man a plan a canal Panama
 */
package ud3ejerciciosStrings;

import java.util.Scanner;

/**
 *
 * @author carra
 */
public class Ej11 {
      public static void main(String[] args) {

        // Variables
        String f, fInv = "";
        boolean palindromo;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos frase
        System.out.print("Introduce frase: ");
        f = in.nextLine();

        // Pasamos frase a mayúsculas y quitamos espacios
        f = f.toUpperCase();
        f = f.replace(" ", "");
        
        // Obtenemos el inverso de f. Ejemplo: HOLA => ALOH
        for (int i = 0; i < f.length(); i++) {
            fInv = f.charAt(i) + fInv;
        }
        
        // Comparamos si f es igual que su inverso
        palindromo = f.equals(fInv);
        
        // Mostramos si es un palíndromo o no
        if (palindromo)
            System.out.println("¡Es un palíndromo!");
        else
            System.out.println("No es un palíndromo :(");
        
    }
}

   