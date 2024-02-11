package unidimensional;

import java.util.*;
/**
 *
 * @author Josee
 */
public class Veinteyuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas para el Triangulo de Pascal:");
        int numRows = scanner.nextInt();
        dibujartriangpasc(numRows);
    }
    public static void dibujartriangpasc(int numRows) {
        int[][] triangle = generartriangulo(numRows);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generartriangulo(int numRows) {
        int[][] triangle = new int[numRows][numRows];

        for (int i = 0; i < numRows; i++) {
            triangle[i][0] = 1;

            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }
}