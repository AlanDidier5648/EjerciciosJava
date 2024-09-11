import java.util.Scanner;

/**
 * -Escribir y compilar un programa que lea 5 números enteros desde el teclado y calcule su suma.
 */
public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arr[] = new int[5];
        int sum = 0;

        System.out.println("Ingresa 5 numeros desde teclado:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = entrada.nextInt();

            sum += arr[i];
        }

        System.out.println("La suma de los 5 numeros ingresados es :" + sum);




    }
}