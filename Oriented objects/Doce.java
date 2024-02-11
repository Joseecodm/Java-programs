package unidimensional;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Josee
 */
public class Doce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Escribe un programa que realice el análisis de un conjunto de temperaturas. El programa debe permitir al usuario ingresar un conjunto de temperaturas y realizar las siguientes operaciones:
        // - Calcular el promedio de las temperaturas.
        // - Encontrar la temperatura máxima y mínima.
        // - Ordenar las temperaturas de forma ascendente.
        // - Mostrar las temperaturas ingresadas.
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] nombres = new String[20];
        double[] promedios = new double[20];

        for (int i = 0; i < 20; i++) {
            nombres[i] = "Estudiante " + (i + 1);
            promedios[i] = 4.5 + random.nextDouble() * (10 - 4.5);
        }

        System.out.println("Promedios generados:");
        Arrays.sort(promedios);
        for (double promedio : promedios) {
            System.out.println(promedio);
        }

        int sobresalientes = 0, regulares = 0, buenos = 0, insuficientes = 0;
        for (double promedio : promedios) {
            if (promedio >= 9.0) {
                sobresalientes++;
            } else if (promedio >= 7.0) {
                buenos++;
            } else if (promedio >= 5.0) {
                regulares++;
            } else {
                insuficientes++;
            }
        }

        System.out.println("\nEstudiantes Sobresalientes: " + sobresalientes);
        System.out.println("Estudiantes Buenos: " + buenos);
        System.out.println("Estudiantes Regulares: " + regulares);
        System.out.println("Estudiantes Insuficientes: " + insuficientes);
        System.out.print("\nIngrese un número para buscar: ");
        double numeroBuscado = scanner.nextDouble();

        int posicion = Arrays.binarySearch(promedios, numeroBuscado);

        if (posicion >= 0) {
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + (posicion + 1) + " de los promedios.");
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en los promedios.");
        }

    }
}
    