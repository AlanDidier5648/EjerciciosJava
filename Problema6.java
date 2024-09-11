/**
 *Disenar un algoritmo que imprima y sume la serie de numeros 3, 6, 9,..... 99.
 */
public class Problema6 {

    public static void main(String[] args) {

        int suma =0;

        for (int i = 3; i <= 99; i+=3) {
            System.out.println(i);
            
            suma+=i;
        }

        System.out.println("La suma es: "+suma);
    }
}