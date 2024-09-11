import java.util.Scanner;

/**
 * Implementar un programa que lea tres numeros y escriba el mayor y el menor.
 */
public class Problema22 {

    public static void main(String[] args) {

        /*Declaracion de clase Scanner y varibales */
        Scanner entrada = new Scanner(System.in);
        int a,b,c;

        /*Ingrso de valores por teclado */
        System.out.println("Ingresa el primer numero de la serie:");
        a = entrada.nextInt();
        
        System.out.println("Ingresa el segundo numero de la serie:");
        b = entrada.nextInt();

        System.out.println("Ingresa el segundo numero de la serie:");
        c = entrada.nextInt();


        /*
         * Para los casos donde las entradas de numeros son 1-2-3 y 1-3-2
         */
        if (a < b && a < c) {
            if (b < c){
               System.out.println("El numero mas grande es " + c );
               System.out.println("El numero mas pequenio es " + b );
            } else {
                System.out.println("El numero mas grande es " + b );
               System.out.println("El numero mas pequenio es " + c );
            }
        /*
         * Para los casos donde las entradas de numeros son 3-2-1 y 2-3-1
         */
        } else if (c < a && c < b) {
            
            if (a < b){
                System.out.println("El numero mas grande es " + b );
                System.out.println("El numero mas pequenio es " + a );
            }else {
                System.out.println("El numero mas grande es " + a );
                System.out.println("El numero mas pequenio es " + b );
            }
        /*
         * Para los casos donde las entradas de numeros son 3-1-2 y 2-1-3
         */
        } else if (b < a && b < c){
            if (a < c){
                System.out.println("El numero mas grande es " + c );
                System.out.println("El numero mas pequenio es " + a );
            }else {
                System.out.println("El numero mas grande es " + a );
                System.out.println("El numero mas pequenio es " + c );
            }
        }
    }
}