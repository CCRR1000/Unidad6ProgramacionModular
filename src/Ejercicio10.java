/*
    10. Escribir un programa que genera la matriz transpuesta de una matriz de 3 filas y 4 columnas. 
    La matriz transpuesta de una matriz M(m,n) se obtiene intercambiando filas por columnas y viceversa; 
    el resultado se tiene que almacenar en una nueva matriz. Muestre las dos matrices, una al lado de la otra.
*/
package src;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Ejercicio10 e10 = new Ejercicio10();
    }


    Scanner scan = new Scanner(System.in);
    int[][] matrizM, transpuesta;
    final int FILAS = 3, COLUMNAS = 4;
    
    public Ejercicio10() {

        matrizM = new int[FILAS][COLUMNAS];

        System.out.println("\nIngrese MATRIZ M:");
        llenarMatriz(FILAS, COLUMNAS, matrizM);

        transpuesta = new int[COLUMNAS][FILAS];
        transponerMatriz(matrizM);
        imprimirMatriz(matrizM, transpuesta);
        System.out.println();

    }
    // matriz 3*4 transpuesta 4*3
    public void imprimirMatriz(int[][] matriz1, int[][] matriz2) {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            if (i<3) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    System.out.print("  "+matriz1[i][j]);
                }
                System.out.print("       ");
            }

            if (i==3) {
                System.out.print("                   ");
            }
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print("  "+matriz2[i][j]);
            }
            System.out.println();
        }
    }

    public void transponerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }

    public void llenarMatriz(int filas, int columnas, int[][] matriz) {
        System.out.println("\n[Numero de fila, Numero de columna]");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor ["+i+"]["+j+"]: ");
                matriz[i][j] = scan.nextInt();
            }
            System.out.println();
        }
    }


}
