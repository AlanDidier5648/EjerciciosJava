/*
 *Implementar un programa que lea el radio y la altura de un cono y calcule su volumen y área total.
 */

import java.util.Scanner;

public class Problema29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        float r,h,v,g,Al,At;


        System.out.print("Ingresa el radio del cono:");
        r = entrada.nextFloat();

        System.out.print("Ingresa la altura del cono:");
        h = entrada.nextFloat();

        v = (((float)(Math.PI*Math.pow(r, 2)))*h)/3;

        g = (float)(Math.sqrt(Math.pow(h, 2)+Math.pow(r, 2)));   

        Al = (float)Math.PI*g*r;

        At = Al + (float)(Math.PI*Math.pow(r, 2));



        System.out.println(v);
        System.out.println(g);
        System.out.println(Al);
        System.out.println(At);








    }
}
