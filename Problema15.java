import java.util.Scanner;

/**
 * Crea una calculadora que realice operaciones basicas (suma, resta, multiplicacion, division) utilizando funciones para cada operacion.
 */
public class Problema15 {

    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in); 
        
        int a,b;


        System.out.println("Ingre el primero numero:");
        a = entrada.nextInt();

        System.out.println("Ingre el segundo numero:");
        b = entrada.nextInt();


        System.out.println("La suma es: "+suma(a, b));
        System.out.println("La suma es: "+resta(a, b));
        System.out.println("La suma es: "+multi(a, b));
        
    }

    static int suma(int a, int b){

        int suma=a+b;
        
        return suma;
    }

    static int resta(int a, int b){
        
        int resta=a+b;
        
        return resta;
    }

    static int multi(int a, int b){
        
        int multi=a*b;
        
        return multi;
    }
}