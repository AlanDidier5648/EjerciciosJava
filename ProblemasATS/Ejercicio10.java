/*
 * leer por teclado dos tablas de 10 nuemros enteros y mezclarlas en una tercera de forma
 * 1 a y 1 b
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];


        System.out.println("Ingresa los elementos del primer arreglo:");
        for (int i = 0; i < a.length; i++) {
            a[i] = entrada.nextInt();
        }

        System.out.println("Ingresa los elementos del segundo arreglo:");
        for (int i = 0; i < a.length; i++) {
            b[i] = entrada.nextInt();
        }

        int j =  0; 
        for (int i = 0; i < 10; i++) {
            c[j] = a [i];
            j++;
            c[j] = b [i];
            j++;
        }

        System.out.println();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        
    }
}
