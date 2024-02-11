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
