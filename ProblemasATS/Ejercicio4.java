/*
 * Hacer un programe que lea un caracter por teclado y determine si es mayuscula o minuscula
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        char a;

        System.out.println("Ingresa la letra:");
        a = entrada.next().charAt(0);

        if (a >= 'A' && a <= 'Z') {
            System.out.println("La letra ingresada es Mayuscula");
        } else if (a >= 'a' && a <= 'z') {
            System.out.println("La letra ingresada es Minuscula");
        } else {
            System.out.println("Le caracter ingresado No es una letra");
        }
    }
}
