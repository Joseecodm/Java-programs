package unidimensional;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
/**
 *
 * @author Josee
 */
public class Trece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribe un programa que realice el análisis de un conjunto de temperaturas. 
        // El programa debe permitir al usuario ingresar un conjunto de temperaturas y realizar las siguientes operaciones:
        // - Calcular el promedio de las temperaturas.
        // - Encontrar la temperatura máxima y mínima.
        // - Ordenar las temperaturas de forma ascendente.
        // - Mostrar las temperaturas ingresadas.

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de temperaturas que desea analizar: ");
        int cantidadTemperaturas = scanner.nextInt();
        int[] temperaturas = new int[cantidadTemperaturas];

        for (int i = 0; i < cantidadTemperaturas; i++) {
            System.out.print("Ingrese la temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();
        }

        Arrays.sort(temperaturas);
        double promedio = Arrays.stream(temperaturas).average().orElse(Double.NaN);
        IntSummaryStatistics stats = Arrays.stream(temperaturas).summaryStatistics();
        int temperaturaMaxima = stats.getMax();
        int temperaturaMinima = stats.getMin();

        System.out.println("\nTemperaturas ingresadas:");

        for (int temperatura : temperaturas) {
            System.out.println(temperatura);
        }

        System.out.println("\nPromedio de temperaturas: " + promedio);
        System.out.println("Temperatura máxima: " + temperaturaMaxima);
        System.out.println("Temperatura mínima: " + temperaturaMinima);

        scanner.close();

    }
    
}
