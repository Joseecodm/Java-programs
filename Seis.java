package CompendioPrograms;

import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // Ingresar un número natural por teclado. Se desea saber y mostrar si es par o impar.
        int n, r;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número natural:");
        n = s.nextInt();

        r = n % 2;

        if (r == 0) {
            System.out.println("El número " + n + " es PAR.");
        } else {
            System.out.println("El número" + n + " es IMPAR.");
        }

    }
}
