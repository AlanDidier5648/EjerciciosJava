/*
 * -Diseñe un algoritmo que sume los 20 primeros números impares.
 */

public class Problema25 {
    public static void main(String[] args) {

       int i,impares,sum;

       i=0;
       impares=1;
       sum = 0;
       while (i<20) {

        impares+=2;
        sum += impares; 

        
        System.out.println("los numeros impares son:" + impares);
        i++;
       }

       System.out.println("La suma de los primeros 20 numeros impares es: "+sum );
    }
}
