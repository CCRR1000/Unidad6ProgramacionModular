/*
   1. Crea un array numérico con 5 elementos. Los números de cada elemento deben ser valores pedidos 
   por teclado al usuario. Muestra por consola el índice y el valor al que corresponde. Se
   Debe utilizar bucles tanto para pedir los valores de los elementos del array como para mostrar su
   contenido por pantalla.
*/
package src;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Ejercicio1 e1 = new Ejercicio1();
    }


    int[] numeros = new int[5];
    Scanner scan = new Scanner(System.in);

    public Ejercicio1() {

        pedirNumeros();
        System.out.println("\nNUMEROS EN ARREGLO");
        mostrarNumeros();
        System.out.println();

    }

    public void pedirNumeros() {

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero en " + (i+1) + "a. posicion: ");
            numeros[i] = scan.nextInt();
        }
    }

    public void mostrarNumeros() {
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice: " + i + " - Valor: " + numeros[i]);
        }
    }



}