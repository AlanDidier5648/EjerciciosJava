/*
 * Leer los datos correspondientes a dos tablas de 12 elementos
 * numericos y mezclarlos en una tercera: 3 de la tabla de A
 * 3 de la tabla de B y as sucesivamente.
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];

        System.out.println("Ingrese los datos de la primera tabla:");
        for (int i = 0; i < a.length; i++) {
            a[i] = entrada.nextInt();
        }


        System.out.println("Ingrese los datos de la segunda tabla:");
        for (int i = 0; i < b.length; i++) {
            b[i] = entrada.nextInt();
        }

        int a1= 0;
        int b1= 0;
        for (int i = 0; i < c.length; i++) {
            while () {
                
            }
        }


    }
}
