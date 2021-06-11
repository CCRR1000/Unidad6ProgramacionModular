/*
    3. Hacer una array unidimensional que acepte ocho números enteros. Luego le pregunte al usuario
    que ingrese un número a buscar, implementar una función que busque ese número, si lo encuentra, 
    debe retornar un valor de verdaderos, en caso contrario, retornar falso.
*/
package src;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Ejercicio3 e3 = new Ejercicio3();
    }

    
    int[] array = new int[8];
    Scanner scar = new Scanner(System.in);

    public Ejercicio3() {

        llenarArreglo(array);
        System.out.print("\nIngrese el numero que desea buscar: ");
        int numero = scar.nextInt();
        boolean sw = buscarNumero(numero, array);

        if (sw==true) {
            System.out.println("\nNumero encontrado.\n");
        } else {
            System.out.println("\nNo se encontro el numero\n");
        }
    }

    public boolean buscarNumero(int num, int[] numeros) {
        boolean nemo=false;
        for (int i = 0; i < numeros.length; i++) {
            if (num==numeros[i]) {
                nemo=true;
                break;
            }
        }
        return nemo;
    }

    public void llenarArreglo(int[] enteros) {
        System.out.println();
        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            enteros[i] = scar.nextInt();
        }
    }


}
