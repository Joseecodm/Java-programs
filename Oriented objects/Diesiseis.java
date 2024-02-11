package unidimensional;

/**
 *
 * @author Josee
 */
public class Diesiseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Se quiere definir dos arreglos de tipo double, v y w con 15 y 20 elementos
         * respectiva
         * mente; en el primero se guardan los valores de la función para x≥ 1.0; el
         * segundo
         * inicializa cada elemento al ordinal del elemento; después se copian los 10
         * últimos elementos de va partir del elemento 11 de w; por último, se escriben
         * los
         * elementos de ambos arreglos.
         * El programa sigue los pasos indicados en el enunciado; utiliza la función
         * exp() de la clase Math para el cálculo de la función ²; como el método
         * arreglo copy () para realizar la copia de elementos de arreglo pedida.
         */

        final int N = 15;
        final int M = 20;
        double[] v = new double[N];
        double[] w = new double[M];
        double x = 1.0;

        for (int i = 0; i < N; x += 0.2, i++) {

            v[i] = Math.exp(2 * x - 1);
        }
        for (int i = 0; i < M; i++) {

            w[i] = (double) i;
        }

        // Imprimir valores de vector v
        System.out.println("Valores del vector w:");
        for (int i = 0; i < N; i++) {

            System.out.println(v[i] + "");

        }

        // Realiada copia de v a w
        System.arraycopy(v, (N - 1) - 10 + 1, w, 10, 10);

        // Imprimir valores de vector w
        System.out.println("Valores del vector w:");
        for (int i = 0; i < M; i++) {

            System.out.println(w[i] + " ");

        }

    }

}
