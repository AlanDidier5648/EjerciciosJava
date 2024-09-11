/**
 * -Escribir el programa de un algoritmo que sume los 50 primeros números naturales.
 */
public class Problema2 {

    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 0; i < 50; i++) {
            sum += i;
        }

        System.out.println(" La suma de los 50 primeros numeros naturales: "+sum);
    }
}