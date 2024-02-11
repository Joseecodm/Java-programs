package unidimensional;

import java.util.*;

/**
 *
 * @author Josee
 */
class Racional {

    /*
     * La clase Racional agrupa las características de todo número racional:
     * numerador y denominador; en dicha clase el método mostrar() escribe en
     * pantalla el número racional, la clase principal crea un vector al que se
     * añaden números racionales; a continuación, se recuperan los elementos y se
     * escriben.
     */

    private int x, y;

    public Racional(int _x, int _y) {

        x = _x;
        y = _y;
    }

    public void mostrar() {

        System.out.println(x + "/" + y);
    }
}

public class Catorce {

    static final int N = 10;

    public static void main(String[] a) {

        Vector num = new Vector();
        for (int i = 0; i <= N; i++) {

            Racional q;
            q = new Racional(3 * i, 3 * i % 7 + 1);
            num.addElement(q);

        }

        int k;
        k = num.size();
        for (int i = 1; i < k; i++) {

            Racional q;
            q = (Racional) num.elementAt(i);
            q.mostrar();

        }

    }
}
