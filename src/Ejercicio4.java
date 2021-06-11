/*
    4. Leer 10 valores de un array de enteros y deducir cuál es la distancia que les separa del número
    mayor. Los números ingresados en el array deben de generarse aleatoriamente.
*/
package src;

import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        Ejercicio4 e4 = new Ejercicio4();
    }


    int[] aleatorios = new int[10];
    Random random = new Random();

    public Ejercicio4() {

        llenarArray(aleatorios);
        imprimirArray(aleatorios);

        int numMayor = buscarMayor(aleatorios);
        System.out.println("\nEl numero mayor es " + numMayor);

        hallarDiferencia(numMayor, aleatorios);
        System.out.println();

    }

    public void hallarDiferencia(int enteroMayor, int[] enteros) {
        System.out.println();
        for (int i = 0; i < enteros.length; i++) {
            int diferencia = enteroMayor - enteros[i];
            System.out.println("La diferencia entre "+enteroMayor+" y "+enteros[i]+" es: "+diferencia);
        }

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
