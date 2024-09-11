/**
 *Escriba un programa que sume los numeros pares comprendidos entre 2 y 100.
 */
public class Problema19 {

    public static void main(String[] args) {
        int suma = 0;


        for (int i = 2; i < 200; i+=2) {
            suma += i;
        }

        System.out.println(suma);
    }
}