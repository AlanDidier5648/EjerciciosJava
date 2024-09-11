/*
 * Problema 1: Mezclar Tres Tablas
 * 
 * Leer por teclado tres tablas de 5 números enteros y mezclarlas en una cuarta tabla
 * alternando los números de cada una de las tablas de entrada.
 * 
 * Ejemplo de Salida:
 * Si las tres tablas de entrada son:
 * - Tabla A: [1, 2, 3, 4, 5]
 * - Tabla B: [6, 7, 8, 9, 10]
 * - Tabla C: [11, 12, 13, 14, 15]
 * 
 * La tabla mezclada será: [1, 6, 11, 2, 7, 12, 3, 8, 13, 4, 9, 14, 5, 10, 15]
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        int d[] = new int[15];

        System.out.println("Ingresa los elementos de la tabla 1:");
        for (int i = 0; i < 5; i++) {
            a[i] = entrada.nextInt();
        }

        System.out.println();

        System.out.println("Ingresa los elementos de la tabla 2:");
        for (int i = 0; i < 5; i++) {
            b[i] = entrada.nextInt();
        }

        System.out.println();

        System.out.println("Ingresa los elementos de la tabla 3:");
        for (int i = 0; i < 5; i++) {
            c[i] = entrada.nextInt();
        }

        int j = 0 ;

        for (int i = 0; i < 5; i++) {
            d[j]=a[i];
            j++;
            d[j]=b[i];
            j++;
            d[j]=c[i];
            j++;
        }

        System.out.println();

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
