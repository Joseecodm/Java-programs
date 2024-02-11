
package unidimensional;

import java.util.Scanner;
/**
 *
 * @author Josee
 */
public class Once {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que guarde en un arreglo de 15 elementos  la tabla de "N" y después se pueda realizar una búsqueda de un numero "X" tecleado por el usuario.
        // Regrese el numero que multiplica (es decir la posición de donde esta guardado el elemento mas uno) 
        // Y en caso de no encontrarlo regrese el mensaje de "ERROR EL NUMERO BUSCADO NO ES MULTIPLO DE N"
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor de N
        System.out.print("Ingrese el valor de N para la tabla: ");
        int n = scanner.nextInt();

        // Crear un arreglo de 15 elementos con la tabla de N
        int[] tabla = new int[15];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (i + 1) * n;
        }

        // Mostrar la tabla
        System.out.println("Tabla de " + n + ":");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println((i + 1) + " * " + n + " = " + tabla[i]);
        }

        // Solicitar al usuario un número para buscar en la tabla
        System.out.print("Ingrese un número para buscar en la tabla: ");
        int numeroBuscado = scanner.nextInt();

        // Realizar la búsqueda en la tabla
        int posicion = buscarNumero(tabla, numeroBuscado);

        // Mostrar el resultado
        if (posicion > 0) {
            System.out.println("El número " + numeroBuscado + " está en la posición " + posicion + " de la tabla.");
        } else {
            System.out.println("ERROR: El número buscado no es múltiplo de " + n);
        }

        scanner.close();
    }

    // Método para buscar un número en la tabla y devolver su posición
    private static int buscarNumero(int[] tabla, int numeroBuscado) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == numeroBuscado) {
                return i + 1; // Devolver la posición (más uno) del elemento encontrado
            }
        }
        return -1; // Devolver -1 si el número no se encuentra en la tabla
    }
}
