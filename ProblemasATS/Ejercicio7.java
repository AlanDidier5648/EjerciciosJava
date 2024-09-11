/*
 Convertir a mayúscula:
Escribe un programa que lea un carácter por teclado y lo convierta a mayúscula si es una letra minúscula.
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char a,may=' ';

        System.out.print("Ingresa una letra:");
        a = entrada.next().charAt(0);

        if (a >= 'a' && a <='z') {

            may = (char)(a-32);
            System.out.println("La letra "+a+" convertida a mayuscual es " + may);

        }else if (a >= 'A' && a <='Z' ) {
            System.out.println("La letra ingresada ya es mayuscula");
        }else{
            System.out.println("El caracter ingresado no es una letra");
        }




    }
}
