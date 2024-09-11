/**
 * -Escribir un programa que genere 100 numeros aleatorios y muestre cual fue el mayor de los numeros generados.
 */
public class Problema8 {

   

     public static int encontrarNumeroMayor(int[] array) {

       
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacio");
        }

       
        int numeroMayor = array[0];

        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > numeroMayor) {
                numeroMayor = array[i];
            }
        }

       
        return numeroMayor;
    }
    
    public static void main(String[] args) {
        
        //declaracion de variables
        int a[]= new int[100];

        //llenado de arreglo con numeros semialeatorios
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*100+1);;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }

        System.out.println();

        System.out.println("El numero mayor del arreglo es: "+ encontrarNumeroMayor(a));

    }
}