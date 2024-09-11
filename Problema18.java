/**
 * Disene un algoritmo que sume los 20 primeros numeros impares.
 * 
 */
public class Problema18 {

    public static void main(String[] args) {


        int sum=0;

        int numImpar[] = new int[20];

        for (int i = 1; i < 40 ; i+=2) {
            sum+=i;
        }

        System.out.println("La suma de todos los numeros impares es:"+sum);
       
    }
}