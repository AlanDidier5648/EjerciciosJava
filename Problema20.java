import java.util.Scanner;

/**
Escriba un programa que lea numeros enteros del teclado y cuente los ceros que se introducen. El final de
datos viene dado cuando se pulse por teclado una tecla distinta de s o S.
 */
public class Problema20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char q;
        int a,sum=0;

        

        do {

            System.out.print("Ingresa un numero: ");
            a= entrada.nextInt();

            if (a==0) {
                sum++;
            }

            entrada.nextLine();
            
            System.out.println("Deseas seguir?");
            q = entrada.next().charAt(0);
            
        } while (q != 'n');

        System.out.println("El numero de ceros ingresados es: " + sum);
    }
}