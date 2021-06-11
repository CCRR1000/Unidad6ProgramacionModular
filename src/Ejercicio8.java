/*
    8. Para dos arrays unidimensionales de strings de 5 elementos, solicite al usuario palabras. Después compare
    si el tamaño de letras de la posición [0] del array 1 es igual al del array 2, y escriba en pantalla Indice, 
    tamaño y si son iguales.
*/
package src;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Ejercicio8 e8 = new Ejercicio8();
    }


    Scanner scan = new Scanner(System.in);
    String[] arrayA = new String[5];
    String[] arrayB = new String[5];

    public Ejercicio8() {

        System.out.println("\nGrupo de palabras A");
        llenarArray(arrayA);
        System.out.println("\nGrupo de palabras B");
        llenarArray(arrayB);

        System.out.println("\n - Comparando Tamaño de Palabras -");
        compararPalabras(arrayA, arrayB);
        System.out.println();

    }

    public void compararPalabras(String[] arr1, String[] arr2) {
        int a, b;

        for (int i = 0; i < arr2.length; i++) {
            a = arr1[i].length();
            b = arr2[i].length();
            System.out.println("\nIndice: " + (i+1) + "  Tamaño A: " + a +  "  Tamaño B: " + b);

            if (a==b) {
                System.out.println(" * SON IGUALES");
            } else {
                System.out.println(" * NO SON IGUALES");
            }
        }
    }

    public void llenarArray(String[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("Escriba la palabra " + (i+1) + ": ");
            array[i] = scan.nextLine();
        }
    }


}
