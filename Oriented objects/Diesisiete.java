package unidimensional;

import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Diesisiete {

    /*
     * Codificar un programa para dar entrada y posterior visualización de un
     * arreglo bidimensional
     * El método leer() da entrada a los elementos de la matriz que se pasa como
     * argumento, y el método visualizar () muestra la tabla en la pantalla.
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int v[][] = new int[3][5];
        leer(v);
        visualizar(v);
    }

    static void leer(int a[][]) {

        int i, j;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entrada de datos de la matriz");
        for (i = 0; i < a.length; i++) {

            System.out.println("Fila: " + i);
            for (j = 0; j < a[i].length; j++) {

                a[i][j] = entrada.nextInt();
            }
        }
    }

    static void visualizar(int a[][]) {

        int i, j;
        System.out.println("\n\t Matriz Leida \n");
        for (i = 0; i < a.length; i++) {

            for (j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println(""); // Salto de línea después de cada fila
        }
    }
}