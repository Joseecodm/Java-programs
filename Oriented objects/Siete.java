
package unidimensional;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Escribe un programa que realice una búsqueda binaria en un arreglo unidimensional ordenado. 
        // El programa debe permitir al usuario ingresar un número y verificar si está presente en el arreglo. 
        // Si el número está presente, se debe mostrar su posición en el arreglo; de lo contrario, se debe mostrar un mensaje indicando que el número no se encontró.
        // Pasos sugeridos:Crea un arreglo unidimensional de números enteros y ordénalo en orden ascendente.Solicita al usuario que ingrese un número.
        // Utiliza el método binarySearch para buscar el número ingresado en el arreglo. Si el resultado es mayor o igual a cero, significa que el número se encontró y muestra su posición en el arreglo. 
        // De lo contrario, muestra un mensaje indicando que el número no se encontró.
    
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo unidimensional de números enteros y ordenarlo
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Arrays.sort(arreglo);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número para buscar en el arreglo: ");
        int numeroBuscar = scanner.nextInt();

        // Utilizar el método binarySearch para buscar el número en el arreglo
        int indiceEncontrado = Arrays.binarySearch(arreglo, numeroBuscar);

        // Mostrar el resultado
        if (indiceEncontrado >= 0) {
            System.out.println("El número " + numeroBuscar + " se encuentra en la posición " + indiceEncontrado + " del arreglo.");
        } else {
            System.out.println("El número " + numeroBuscar + " no se encuentra en el arreglo.");
        }

        scanner.close();
  
    }
    
}
