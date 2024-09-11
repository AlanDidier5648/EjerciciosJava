/**
 * Diseñe un algoritmo que calcule la suma de los enteros 1, 2,....,30.
 */
public class Problema10 {

    public static void main(String[] args) {

        int sum=0;

        for (int i = 0; i <= 30; i++) {
            sum+=i;
        }

        System.out.println("La suma de los primeros 30 numeros es:"+sum);
    }
}