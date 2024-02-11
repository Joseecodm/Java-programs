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

        //Imprimir valores de vector v
        System.out.println("Valores del vector w:");
        for (int i = 0; i < N; i++) {

            System.out.println(v[i] + "");
    
        }

        //Realiada copia de v a w
        System.arraycopy(v, (N - 1) - 10 + 1, w, 10, 10);
            
        //Imprimir valores de vector w
        System.out.println("Valores del vector w:");
        for (int i = 0; i < M; i++) {

            System.out.println(w[i] + " ");

        }

    }

}
