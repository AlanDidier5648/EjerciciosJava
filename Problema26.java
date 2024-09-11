/*
 *Implementar un programa que lea tres números y calcule la media.
 */

import java.util.Scanner;

public class Problema26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,c;
        float media;

        System.out.print("Ingresa le primer numero:");
        a = entrada.nextInt(); 

        System.out.print("Ingresa le segundo numero:");
        b = entrada.nextInt(); 

        System.out.print("Ingresa le primer numero:");
        c = entrada.nextInt(); 

        media = (a+b+c)/3;

        System.out.println("la media de los numeros ingresados es:"+media);
    }
}
