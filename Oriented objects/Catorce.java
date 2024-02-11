package unidimensional;

import java.util.*;

/**
 *
 * @author Josee
 */
class Racional {

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

        //recuperacion de los elementos
        int k;
        k = num.size();
        for (int i = 1; i < k; i++) {

            Racional q;
            q = (Racional) num.elementAt(i);
            q.mostrar();

        }

    }
}
