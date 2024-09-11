/**
 * -Escriba un programa que presente en pantalla todas las potencias enteras de 2 que sean menores o iguales que 100.
 */
public class Problema11 {

    public static void main(String[] args) {
        int a;

        for (int i = 1; i < 7; i++) {
            a = (int)Math.pow(2, i);
            System.out.println(a);
        }
    }
}