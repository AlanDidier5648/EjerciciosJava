/**
 *Escriba un algoritmo que lea tres numeros enteros y decida si uno de ellos coincide con la suma de los otros dos.
 */

import java.util.Scanner;

/**
  * Problema5
  */
 public class Problema5 {
 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Ingresa el primer numero: ");
        n1 = entrada.nextInt();

        System.out.println("Ingresa el primer numero: ");
        n2 = entrada.nextInt();

        System.out.println("Ingresa el primer numero: ");
        n3 = entrada.nextInt();


        if (n1 + n2 == n3 || n1 + n3 == n2 || n2 + n3 == n1 ) {
            System.out.println("Uno de los numeros es igual a la suma de los otros dos ");
        }else{
            System.out.println("Ninguno de los numeros ingresados es igual a las suma los otros dos");
        }



    }
 }