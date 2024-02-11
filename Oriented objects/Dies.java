
package unidimensional;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Dies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Con base en el programa que censa la temperatura de "N" días dados por el usuario, 
        // Realizar un programa que permita realizar la búsqueda binaria  de un elemento "temperatura buscada" y regrese la localidad del arreglo en que se encuentra esa temperatura. para lo cual deberán ordenar el arreglo y enviar si esa temperatura esta guardado en arreglo, regresa la cantidad y si no, regrese un mensaje que esta temperatura no existe registro en los días censados.
        // En la próxima clase entregar en libreta la practica (escrita o impresa) así como integrar de forma individual su álbum de practicas con el formato utilizado el semestre pasado.
        
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de días a censar
        System.out.print("Ingrese la cantidad de días a censar: ");
        int cantidadDias = scanner.nextInt();

        // Crear un arreglo de temperaturas
        int[] temperaturas = new int[cantidadDias];

        // Solicitar al usuario ingresar las temperaturas para cada día
        for (int i = 0; i < cantidadDias; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();
        }

        // Ordenar el arreglo de temperaturas
        Arrays.sort(temperaturas);

        // Solicitar al usuario la temperatura a buscar
        System.out.print("Ingrese la temperatura a buscar: ");
        int temperaturaBuscada = scanner.nextInt();

        // Utilizar búsqueda binaria para encontrar la temperatura
        int indiceEncontrado = Arrays.binarySearch(temperaturas, temperaturaBuscada);

        // Mostrar el resultado
        if (indiceEncontrado >= 0) {
            System.out.println("La temperatura " + temperaturaBuscada + " se encuentra en la posición " + indiceEncontrado + " del arreglo.");
            int cantidadVeces = contarRepeticiones(temperaturas, temperaturaBuscada);
            System.out.println("La temperatura " + temperaturaBuscada + " aparece " + cantidadVeces + " veces en el arreglo.");
        } else {
            System.out.println("La temperatura " + temperaturaBuscada + " no existe en los días censados.");
        }

        scanner.close();
    }

    // Método para contar las repeticiones de una temperatura en el arreglo
    private static int contarRepeticiones(int[] arreglo, int temperatura) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == temperatura) {
                contador++;
            }
        }
        return contador;
        
    }
    
}
