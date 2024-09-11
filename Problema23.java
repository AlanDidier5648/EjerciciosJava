import java.util.Scanner;

/**
Implementar un programa que lea el radio de un cı́rculo y calcule su área, ası́ como la longitud de la
circunferencia de ese radio.
 */
public class Problema23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float radio,area,cir;

        radio = entrada.nextFloat();

        area = ((float)(Math.PI))*((float)(Math.pow(radio, 2)));

        /*circunferencia = pi*diametro */

        cir = 2* radio * ((float)(Math.PI));


        System.out.println("El area de del curculo es: " + area);
        System.out.println("La circunferencia del circulo es :" + cir);

        



    }
}