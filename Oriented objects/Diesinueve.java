package unidimensional;

import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Diesinueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Se lee una lista con un máximo de 21 números enteros, a continuación, se
         * calcula su
         * suma y el valor máximo; la entrada de datos termina al introducir la clave -1.
         * El programa consta del método entrada () que lee desde el teclado los
         * elementos.
         * del arreglo hasta que se ingresa el dato clave, devuelve el número de
         * elementos leído,
         * éste nunca puede ser mayor que el máximo de elementos (length); el método
         * sumaEnteros() calcula la suma de los elementos introducidos en el arreglo, se
         * pasan dos parámetros: el arreglo y el número de elementos.
         * El método maximo() tiene los mismos parámetros que suma Enteros () y
         * determina el valor máximo.
         */
        final int Num = 21;
        int items[] = new int[Num];
        int n;
        n = entrada(items);
        System.out.println("\nValor maximo: " + maximo(items, n));
    }

    static int entrada(int w[]) {

        int k = 0, x;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un máximo de " + w.length + " datos, terminar con -1");

        do {
            x = entrada.nextInt();
            if (x != -1) {
                w[k++] = x;
            }
        } while ((k < w.length) && (x != -1));

        return k;
    }

    static int sumaEnteros(int w[], int n) {

        int i, total = 0;
        for (i = 0; i < n; i++) {
            total += w[i];
        }
        return total;
    }

    static int maximo(int w[], int n) {

        int mx, i;
        mx = w[0];
        for (i = 1; i < n; i++) {
            mx = (w[i] > mx) ? w[i] : mx;
        }
        return mx;
    }
}
