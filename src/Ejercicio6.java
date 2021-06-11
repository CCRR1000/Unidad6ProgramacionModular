/*
    6. Escribir un programa que multiplique por dos los elementos de la siguiente matriz:
        5 6 13
        14 2 4
        21 7 6
*/
package src;

public class Ejercicio6 {

    public static void main(String[] args) {
        Ejercicio6 e6 = new Ejercicio6();
    }
    
    
    int[][] matrix = new int[3][3];

    public Ejercicio6() {
        
        inicializarMatriz();
        System.out.println("\nMATRIZ:");
        imprimirMatriz();
        multiplicarMatriz(2);
        System.out.println("\nMATRIZ*2:");
        imprimirMatriz();
        System.out.println();

    }

    public void multiplicarMatriz(int factor) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] *= factor;
            }
        }
    }

    public void imprimirMatriz() {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public void inicializarMatriz() {
        matrix[0][0] = 5;
        matrix[0][1] = 6;
        matrix[0][2] = 13;
        matrix[1][0] = 14;
        matrix[1][1] = 2;
        matrix[1][2] = 4;
        matrix[2][0] = 21;
        matrix[2][1] = 7;
        matrix[2][2] = 6;
    }


}
