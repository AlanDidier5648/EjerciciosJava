

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char a,minuscula;

        System.out.print("Ingresa una letra:");
        a = entrada.next().charAt(0);

        if (a >= 'A' && a <='Z') {
            minuscula = (char)(a + 32);
            System.out.println("La letra convertida en minuscula es:" + minuscula);
        }else {
            System.out.println("El caracter ingresado no es una letra");
        }
    }
}
