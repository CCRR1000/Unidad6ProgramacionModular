/*
 *  11. Crea un programa en el que se pida por consola el nombre de 6 alumnos y la nota de cada uno de ellos 
 *  como valor numérico. El resultado que debe mostrarse es el nombre de cada alumno, su nota y su calificación 
 *  como texto (Sobresaliente, Notable, Bien o Suspenso). 
 *  Para ello crea un array numérico y otro de String (ambos unidimensionales). En el array numérico se 
 *  insertarán las calificaciones facilitadas por el usuario entre 0 y 10 (debemos controlar que inserte 
 *  una nota válida), pudiendo ser decimal. En el array de Strings se insertarán los nombres de los alumnos.
 *
 *  Cree un array de String donde insertamos el resultado de la nota con palabras admitiendose estos valores: 
 *  Sobresaliente, Notable, Bien o Suspenso.
 *  El programa debe comprobar la nota de cada alumno teniendo en cuenta esta equivalencia:
 *      Si la nota está entre 0 y 4,99 será un Suspenso.
 *      Si la nota está entre 5 y 6,99 será un Bien.
 *      Si la nota está entre 7 y 8,99 será un Notable.
 *      Si la nota está entre 9 y 10 será un Sobresaliente.
 *      Muestra por pantalla, el alumno su nota y su resultado en palabras utilizando bucles.
 */

package src;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Ejercicio11 e11 = new Ejercicio11();
    }


    Scanner scan = new Scanner(System.in);
    final int N_ALUMNOS = 6;
    String[] nombres = new String[N_ALUMNOS];
    String[] calificacion = new String[N_ALUMNOS];    
    double[] notas = new double[N_ALUMNOS];
    
    
    public Ejercicio11() {     

        System.out.println("\nIngrese los datos de los alumnos");
        solicitarDatos();
        resultadosCalificacion();
        mostrarResultados();
    }

    public void mostrarResultados() {
        System.out.println("\n\nRESULTADOS: \n");
        for (int i = 0; i < N_ALUMNOS; i++) {
            System.out.println((i+1)+") Nombre: "+nombres[i]);
            System.out.println(     "   Nota: "+notas[i]);
            System.out.println(     "   Resultado Calificacion: "+calificacion[i]+"\n");
        }
        
    }

    public void resultadosCalificacion() {
        for (int i = 0; i < calificacion.length; i++) {
            calificacion[i] = asignarCalificacion(notas[i]);
        }
    }

    public String asignarCalificacion(double nota) {
        String calificacion;

        if (nota < 5) {
            calificacion = "Suspenso";
        } else if (nota < 7) {
            calificacion = "Bien";
        } else if (nota < 9) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }

        return calificacion;
    }

    public void solicitarDatos() {
        
        for (int i = 0; i < N_ALUMNOS; i++) {
            System.out.println("\nEstudiante " + (i+1));
            System.out.print("Nombre: ");
            nombres[i] = scan.nextLine();
            
            notas[i] = pedirNota();
        }
    }

    public double pedirNota() {
        double nota;
        do {
            System.out.print("Nota: ");
            nota = Double.parseDouble(scan.nextLine());

            if (nota>10 || nota<0) {
                System.out.println("-> ERROR: La nota debe estar entre 0 y 10");
            } 
        } while (nota>10 || nota<0);
        
        return nota;
    }

}
