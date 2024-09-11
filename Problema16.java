import java.util.Scanner;

/**
 * Crea una funcion para calcular el factorial de un numero.
 */
public class Problema16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;

        System.out.println("ingresa un numero; ");
        a = entrada.nextInt();

        System.out.println(factorial(a));

    }


    static int factorial(int a){
        
        int fact=1;

        for (int i = 1; i <=  a ; i++) {
            fact*=i;
        }
        
        return fact;
    }
}