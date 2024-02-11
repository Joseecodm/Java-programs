package CompendioPrograms;

import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Se ingresan por teclado los catetos de un triángulo rectángulo.
        // Se desea hallar y mostrar su hipotenusa.

        int b, a;
        float hip;

        Scanner d = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo rectángulo:");
        b = d.nextInt();

        System.out.println("Ingrese la altura del triángulo rectángulo:");
        a = d.nextInt();

        hip = (b ^ 2 + a ^ 2);

        double raiz = Math.sqrt(hip);

        System.out.println("La hipotenusa del triángulo rectángulo es: " + raiz);
    }
}
