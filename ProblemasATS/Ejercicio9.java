
/*
    Leer 10 numeros enteros, guardalos en un arreglo. Debemos mostrarlos 
    en el siguiente orden:el primero, el ultimo, el segundo, el penultimo, el tercero.
*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a[] = new int[10];

        System.out.println("Ingresa los 10 numeros en el arreglos:");
        for (int i = 0; i < a.length; i++) {
            a[i]=entrada.nextInt();
        }

        System.out.println("EL arreglo de  salida es:");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
            System.out.println(a[9-i]);
        }
    }
}
