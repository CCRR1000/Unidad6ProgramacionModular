/*
    9. Escribir un programa que sume dos matrices bidimensionales. Las matrices para que puedan sumarse
    deben tener las mismas dimensiones.
*/
package src;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Ejercicio9 e9 = new Ejercicio9();
    }


    Scanner scan = new Scanner(System.in);
    int filas, columnas;
    int[][] matrizA, matrizB, matrizSuma;

    
    public Ejercicio9() {

        System.out.print("\nNumero de filas: ");
        filas = scan.nextInt();
        System.out.print("Numero de columnas: ");
        columnas = scan.nextInt();
        
        matrizA = new int[filas][columnas];
        matrizB = new int[filas][columnas];
        matrizSuma = new int[filas][columnas];
    
        System.out.println("\nIngrese MATRIZ A:");
        llenarMatriz(filas, columnas, matrizA);
        System.out.println("\nIngrese MATRIZ B:");
        llenarMatriz(filas, columnas, matrizB);

        sumarMatrices(matrizA, matrizB);
        System.out.println("\nMATRIZ A + B:");
        imprimirMatriz(matrizSuma);
        System.out.println();

    }

    public void sumarMatrices(int[][] matrizA, int[][] matrizB) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
    }

    public void imprimirMatriz(int[][] matriz) {
        System.out.println();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("  "+matriz[i][j]);
            }
            System.out.println();
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
