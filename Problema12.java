/**
 * -Escriba un algoritmo que sume los números pares comprendidos entre 20 y 100 ambos inclusive.
 */
public class Problema12 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 20; i <= 100; i+=2) {
            sum+=i;
        }

        System.out.println("La suma de los numeros pares entre 20 y 100 es : "+ sum);
    }
}