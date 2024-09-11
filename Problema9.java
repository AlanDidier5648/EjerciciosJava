import java.util.Scanner;

/**
 * -Diseñar un algoritmo que lea e imprima una serie de números distintos de cero. El algoritmo debe termina
con un valor cero que no se debe imprimir. Visualizar el número de valores leı́dos.
 */
public class Problema9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,cont=0;

        System.out.println("Ingresa un numero:");
        a = entrada.nextInt();


        while (a != 0) {
            cont++;
            a = entrada.nextInt();
        }

        System.out.println("El numero de digitos ingresados es; "+cont);
    }
}