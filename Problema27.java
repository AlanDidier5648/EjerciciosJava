import java.util.Scanner;

/**
 * Construir un programa que indique si un número introducido por teclado es positivo, igual a cero, o negativo
 */
public class Problema27 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a;

        System.out.println("Ingresa un numero:");
        a = entrada.nextInt();

        if (a > 0) {
            System.out.println("el numero es positivo.");
        } else if (a ==0){
            System.out.println("El numero ingresado es cero.");
        } else {
            System.out.println("El numero ingresado es negativon");
        }
    }
}