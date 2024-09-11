/*
 * Problema 2: Intercalar Números Pares e Impares
 * 
 * Leer por teclado una tabla de 20 números enteros. Crear dos tablas adicionales,
 * una para los números pares y otra para los números impares, y luego mezclarlas en
 * una cuarta tabla intercalando los pares e impares.
 * 
 * Ejemplo de Salida:
 * Si la tabla de entrada es: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
 * 
 * Las tablas resultantes serán:
 * - Pares: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
 * - Impares: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
 * 
 * La tabla mezclada será: [2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17, 20, 19]
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        /*
         * Declaracion de variables
         */
        Scanner entrada = new Scanner(System.in);

        int a [] = new int[20];
        int pares[];
        int impares[];
        int contPar,contImpar;


        /**
         * Ingreso de datos por teclado
         */
        System.out.println("Ingresa los 20 elementos de la tabla:");
        for (int i = 0; i < a.length; i++) {
            a[i] = entrada.nextInt();
        }

        /*
         * verificar cuantos numeros pares e impares hay en la tabla a
         */
        contPar=0;
        contImpar=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0 ) {
                contPar++;
            }else {
                contImpar++;
            }
        }

        /*
         * numero de nnumeros pares e impares encontrados
         */
        pares = new int[contPar];
        impares = new int[contImpar];

        int j=0,k=0;

        /*si el numero es par se agrega a la tabla de los pares y si no a la de los impares */
        for (int i = 0; i < 20 ; i++) {
            if (a[i]%2 == 0) {
                pares[j]=a[i];
                j++;
            }else{
                impares[k]=a[i];
                k++;
            }
        }

        /*
         * imprime los numeros impares
         */
        System.out.println("Los numeros impares son:");
        for (int i = 0; i < impares.length; i++) {
            System.out.println(impares[i]);
        }

        /*
         * imprime los numeros pares
         */

        System.out.println();
        System.out.println("Los numeros pares son:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }

        int desorden[] = new int[20];


        
        
        int indicePar = 0;
        int indiceImpar = 0;
        int indiceCombina = 0;

        while (indicePar < pares.length || indiceImpar < impares.length) {
            if (indicePar < pares.length) {
                desorden[indiceCombina]=pares[indicePar];
                indicePar++;
                indiceCombina++;
            } 
            
            if (indiceImpar < impares.length) {
                desorden[indiceCombina]=impares[indiceImpar];
                indiceImpar++;
                indiceCombina++;
            }
        }

        
        while (indicePar < pares.length) {
            desorden[indiceCombina]=pares[indicePar];
            indicePar++;
            indiceCombina++;
        }

        while (indiceImpar < impares.length) {
            desorden[indiceCombina]=pares[indiceImpar];
                indicePar++;
                indiceCombina++;
        }

        System.err.println();
        System.out.println("La tabla combinada es:");
        for (int i = 0; i < desorden.length; i++) {
            System.out.println(desorden[i]);
        }



        
    }
}
