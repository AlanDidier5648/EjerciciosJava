/*
 * Convertir a minúscula:
    Escribe un programa que lea un carácter por teclado y lo convierta a minúscula si es una letra mayúscula.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char a,min=' '; 

        System.out.println("Ingresa un caracter:");
        a = entrada.next().charAt(0);

        if ( a >= 'A' && a <= 'Z') {
            min=(char)(a+32);
            System.out.println("La letra "+a+" convertida a minuscula es " + min);
        } else if ( a >= 'a' && a <= 'z') {
            System.out.println("El caracter ingresado ya es minuscula");
        }



    }
}
