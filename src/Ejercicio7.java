/*
    7. Hacer un array 4x3 de enteros que se llene aleatoriamente entre [0,555]. Al final, debe 
    mostrar la suma de todos los números que estén en una fila par.
*/
package src;

import java.util.Random;

public class Ejercicio7 {

    public static void main(String[] args) {
        Ejercicio7 e7 = new Ejercicio7();
    }
    
    
    int[][] enteros = new int[4][3];
    Random raya = new Random();

    public Ejercicio7() {

        llenarArreglo();
        System.out.println("\nMatriz:");
        imprimirMatriz(enteros);
        int suma = sumarFilaPar(enteros);
        System.out.println("\nLa suma es: " + suma+"\n");

    }

    public int sumarFilaPar(int[][] numeros) {
        int sumatoria=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if (i%2 == 0) {
                    sumatoria += numeros[i][j];
                }
            }
        }
        return sumatoria;
    }

    public void imprimirMatriz(int[][] numeros) {
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                System.out.print(numeros[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public void llenarArreglo() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                enteros[i][j] = raya.nextInt(555+1);
            }
        }
    }


}
