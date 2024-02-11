
package unidimensional;

import java.util.Scanner;
/**
 *
 * @author Josee
 */
public class Cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // En España cada persona está identificada con un Documento Nacional de Identidad (DNI) en el que figura un número y una letra, por ejemplo
        // 56999545W
        // La letra que sigue al número se calcula siguiendo la metodología que vamos a indicar. Crea un programa en java que calcule la letra de un 
        // DNI a partir del número de DNI que introduzca el usuario. Es decir, se debe pedir el DNI sin la letra por teclado y el programa nos devolverá el DNI
        // completo (con la letra).
        // Para calcular la letra, se debe tomar el resto de dividir
        // nuestro número de DNI entre 23. El resultado debe estar por tanto entre 0 y 22.
        // Crea un método obtenerLetra(int numeroDNI) donde según el
        // resultado de la anterior fórmula busque en un array de caracteres la posición que corresponda a la letra. Esta es la tabla de caracteres:
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de DNI (sin la letra): ");
        int numeroDNI = scanner.nextInt();

        // Llamada al método para obtener la letra
        char letraDNI = obtenerLetra(numeroDNI);

        // Mostrar el DNI completo (número + letra)
        System.out.println("El DNI completo es: " + numeroDNI + letraDNI);

        scanner.close();
    }

    // Método para obtener la letra del DNI
    private static char obtenerLetra(int numeroDNI) {
        // Array de caracteres con las letras correspondientes a cada posición
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Calcular el índice de la letra usando la fórmula indicada
        int indiceLetra = numeroDNI % 23;

        // Devolver la letra correspondiente al índice calculado
        return letrasDNI[indiceLetra];
    }
    
    
}
