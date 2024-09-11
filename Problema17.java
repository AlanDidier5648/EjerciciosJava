/**
 * Problema17
 */
public class Problema17 {
    public static void main(String[] args) {
        int numero = 17;
        if (esPrimo(numero)) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }

    static boolean esPrimo(int n) {

        //Si el numero es menor regresa falso

        if (n <= 1) {
            return false;
        }

        // el iterador inicia en 2 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
