/*
    2. Hacer un programa que llene un array de 10 enteros con números aleatorios del 0 al 99, luego
    de eso los muestre en pantalla y diga cuál es el elemento mayor y cuántas veces se repite.
*/

package src;

import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        Ejercicio2 e2 = new Ejercicio2();
    }
    
    
    int[] aleatorios = new int[10];
    Random random = new Random();

    public Ejercicio2() {

        llenarArray(aleatorios);
        imprimirArray(aleatorios);

        int numMayor = buscarMayor(aleatorios);
        System.out.println("\nEl numero mayor es: " + numMayor);

        int contador = buscarRepetidos(numMayor, aleatorios);
        System.out.println("\nSe repite " + contador + " veces.");
        System.out.println();

    }

    public int buscarRepetidos(int entero, int[] arrayEnteros) {
        int repetidos = 0;
        for (int i = 0; i < aleatorios.length; i++) {
            if (entero==arrayEnteros[i]) {
                repetidos++;
            }
        }
        return repetidos;
    }

    public int buscarMayor(int[] enteros) {

        int mayor=0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i]>mayor) {
                mayor = enteros[i];
            }
        }
        return mayor;
    }

    public void imprimirArray(int[] enteros) {
        System.out.println();
        for (int i = 0; i < aleatorios.length; i++) {
            System.out.println(aleatorios[i]);
        }
    }

    public void llenarArray(int[] enteros) {
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = random.nextInt(100);
        }
    }


}
