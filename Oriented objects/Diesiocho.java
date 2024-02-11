package unidimensional;

import java.util.Scanner;

class Diesiocho {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] a) {

        double v[];
        int n;

        System.out.print("Número de elementos: ");
        n = entrada.nextInt();
        v = new double[n];
        leerArreglo(v);
        System.out.println("El producto de los elementos = " + producto(v));
    }

    static void leerArreglo(double a[]) {
        int n = 0;
        System.out.println("Introduzca " + a.length + " datos.");
        for (n = 0; n < a.length; n++) {
            a[n] = entrada.nextDouble();
        }
    }

    static double producto(double w[]) {
        double pd = 1.0;
        int n = w.length - 1;
        while (n > 0) {
            if (w[n] > 0.0) {
                pd *= w[n--];
            } else {
                n--;
            }
        }
        return pd;

    }
}
