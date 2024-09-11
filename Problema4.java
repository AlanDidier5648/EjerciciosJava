import java.util.Scanner;

/**
 * Escriba un programa lea la base y la altura de un triangulo y calcule su area.
 */
public class Problema4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int base,altura;
        float area;
             

        System.out.println("Ingresa la base del triangulo: ");
        base = entrada.nextInt();


        System.out.println("Ingresa la altura del triangulo: ");
        altura = entrada.nextInt();

        area = (base*altura)/2;

        System.out.println("el area es: "+area);
    }
}