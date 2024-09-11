import java.util.Scanner;

/**
 * -Escribir un programa que lea tres enteros y emita un mensaje que indique si están o no en orden numérico.
 */
public class Problema24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,c;

        System.out.println("ingresa el primer numero");
        a = entrada.nextInt();

        System.out.println("ingresa el segundo numero");
        b = entrada.nextInt();

        System.out.println("ingresa el tercer numero");
        c = entrada.nextInt();

        if (a < b && b < c) {
            System.out.println("Los numero estan en orden");
        } else {
            System.out.println("Los numero no estan en orden");
        }






    }
}