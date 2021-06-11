/*
    5. En un arreglo tenemos las notas de un grupo de alumnos de una clase con valores Nota[0], 
    Nota[1], ..., Nota[n – 1], establecidas entre 0 y 10. El último dato es una bandera con valor –50. 
    El número de notas que contiene el arreglo no se conoce, pero se sabe que el mínimo número de
    alumnos en la clase es 1 y el máximo 100. Se desea crear un programa que determine la nota media.
        a. 5,  7, 2, 3, 9, 5, 6, 8, - 50
        b. 6,-50,
        c. 1,  5, 4, 7, 6, 2, 7, 8, 3, 2, 9, 4, 5, 3, 6, 6, 8, 8, - 50
    Para este ejercicio debe crear una función que inicializa el arreglo.
    Una función para calcular el valor medio
    Debe de realizar los cálculos de los tres conjuntos de notas sugeridos en la misma ejecución 
    del programa.
*/
package src;

public class Ejercicio5 {

    public static void main(String[] args) {
        Ejercicio5 e5 = new Ejercicio5();
    }


    int[] notas = new int[100];
    int[] seccionA = {5, 7, 2, 3, 9, 5, 6, 8, - 50}; 
    int[] seccionB = {6,-50}; 
    int[] seccionC = {1, 5, 4, 7, 6, 2, 7, 8, 3, 2, 9, 4, 5, 3, 6, 6, 8, 8, - 50};

    public Ejercicio5() {

        System.out.println();
        System.out.println("Notas A:");
        trabajarSeccion(seccionA);

        System.out.println();
        System.out.println("Notas B:");
        trabajarSeccion(seccionB);

        System.out.println();
        System.out.println("Notas C:");
        trabajarSeccion(seccionC);

    }

    public void trabajarSeccion(int[] seccion) {
        
        double promedio;

        inicializarNotas(seccion);
        imprimirArreglo();
        promedio = calcularPromedio();
        System.out.println("\nLa nota media es: "+promedio+"\n");
    }

    public double calcularPromedio() {
        int suma=0, contador=0, nota;
        double media=0;

        do {
            nota = notas[contador++];
            if (nota != -50) {
                suma += nota;
            }
        } while (nota != -50);

        media = (double)suma / (contador-1);

        return media;
    }

    public void imprimirArreglo() {
        int nota, contador=0;
        do {
            nota = notas[contador++];
            if (nota != -50) {
                System.out.print(nota + ", ");
            }           
        } while (nota != -50);
        System.out.println();
    }

    public void inicializarNotas(int[] notasSeccion) {
        for (int i = 0; i < notasSeccion.length; i++) {
            notas[i] = notasSeccion[i];
        }
    }


}
