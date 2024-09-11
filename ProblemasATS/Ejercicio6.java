/*
 * Determinar si un carácter es un dígito:
    Escribe un programa que lea un carácter por teclado y determine si es un dígito (0-9).
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char a;

        System.out.println("Ingresa un digito:(0-9)");
        a = entrada.next().charAt(0);

        if (a >= '0' && a <= '9' ) {
            System.out.println("EL caracter ingresado es un digito");
        }else{
            System.out.println("El caracter ingresado no es un digito");
        }
    }
}
