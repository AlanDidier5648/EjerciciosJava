
/*
 * Una temperatura Celsius (centı́grados) puede ser convertida a una temperatura equivalente F de acuerdo a
    la siguiente fórmula:

        9 
    F = -   c + 32
        5

Escribir un programa que lea la temperatura en grados Celsius y la escriba en F.
 */

import java.util.Scanner;

public class Problema28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float c,f;

        System.out.println("Ingresa la temperatura en Celsius:");
        c = entrada.nextFloat();

        f = ((float)9/5)*c + 32;

        System.out.println("La conversion es: " + f);
    }
}
