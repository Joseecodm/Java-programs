
package unidimensional;

import java.util.Random;

/**
 *
 * @author Josee
 */
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crea un array numérico con 5 elementos. Los números de cada elemento deben
        // ser valores generados aleatoreamente entre 0 y 10.
        // Muestra por consola el índice y el valor al que corresponde.
        // Debes utiliza bucles tanto para pedir los valores de los elementos del array como para mostrar su contenido por pantalla.
        // Ejemplo: Introducimos los valores 2, 4, 5, 8 y 10 .Lo que se tiene que
        // mostrar por consola sería:
        // En el indice 0 esta el valor 2
        // En el indice 1 esta el valor 4
        // En el indice 2 esta el valor 5
        // En el indice 3 esta el valor 8
        // En el indice 4 esta el valor 10

        int[] miArray = new int[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            miArray[i] = random.nextInt(10 - 0) + 1;
        }

        for (int i = 0; i < miArray.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + miArray[i]);
        }

    }

}
