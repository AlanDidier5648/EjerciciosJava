/*
 * Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
 * Juan tiene  la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa
 * que calcule e imprima la cantidad de dinero que tienen entre los 3. 
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        float n,luis,guillermo,juan;

        System.out.println("Ingresa un numero:");
        n = entrada.nextInt();

        guillermo = n;
        luis=guillermo/2;
        juan = (luis+guillermo)/2;

        System.out.println(guillermo);
        System.out.println(luis);
        System.out.println(juan);

        System.out.println();

        System.out.println(juan+luis+guillermo);



    }   
}
