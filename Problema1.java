import java.util.Scanner;

/**
 * Escriba el programa de un algoritmo que lea tres numeros y si el primero es positivo calcule el producto de
 * los otros dos, y en otro caso calcule la suma.
 */
public class Problema1 {

    public static void main(String[] args) {

        /*Se declara la clase Scanner y las variables que se van a utilizar */
        Scanner entrada = new Scanner(System.in);
        int a,b,c,sum,mult;

        /*Ingreso de valores por teclado */

        System.out.println("Ingresa el valor de a:");
        a= entrada.nextInt();

        System.out.println("Ingresa el valor de b:");
        b= entrada.nextInt();

        System.out.println("Ingresa el valor de c:");
        c= entrada.nextInt();


        /*Se ingresan 3 nunmeros. Si el primer valor (a) ingresado es mayor a cero, entonces se hara una multiplicacion de 
         * de los otros dos numeros, pero si no entonces se hara una suma de dichos numeros
         */

        if (a>0) {
            mult = b*c;
            System.out.println("La multiplicacion de los otros dos numeros es:"+mult);
        }else{
            sum = b+c;
            System.out.println("La suma de los dos numero es: "+sum);
        }


    }
}