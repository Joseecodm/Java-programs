package unidimensional;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * author Josee
 */
public class Veinte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Se realizan las operaciones de añadir, eliminar, buscar y reemplazar cadenas
         * con
         * ArrayList.
         * La colección estará formada por cadenas leídas del teclado; la declaración va
         * a
         * especificar que la colección contiene elementos String.
         * Una vez formada la colección se elimina una cadena concreta y se reemplaza el
         * elemento que ocupa la posición central; para realizar una búsqueda, se
         * utiliza el método indexOf() que devuelve la posición que ocupa, o bien -1, a
         * partir de esta posición se crea un iterador llamando al método listIterator
         * () con el fin de recorrer y, a la vez, escribir los elementos.
         */

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> av = new ArrayList<String>();
        String cd;

        System.out.println("Datos de entrada (adios para acabar)");

        do {
            cd = entrada.nextLine();
            if (!cd.equalsIgnoreCase("adios")) {
                av.add(cd);
            } else {
                break;
            }
        } while (true);

        System.out.println("Lista completa: " + av);

        // elimina una palabra
        System.out.println("Palabra a eliminar: ");
        cd = entrada.nextLine();

        if (av.remove(cd)) {
            System.out.println("Palabra borrada, lista actual: " + av);
        } else {
            System.out.println("No está en la lista la palabra");
        }

        // reemplaza elemento que está en el centro
        av.set(av.size() / 2, "NuevaCadena");
        System.out.println("Lista completa: " + av);

        // búsqueda de una palabra
        System.out.println("Búsqueda de una palabra: ");
        cd = entrada.nextLine();
        int k = av.indexOf(cd);
        if (k >= 0) {
            System.out.println("Cadena encontrada en la posición " + k);
        } else {
            System.out.println("No se encuentra en el arreglo ");
        }
    }
}
