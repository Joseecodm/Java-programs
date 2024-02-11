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

        System.out.print("Ingrese el valor de N para la tabla: ");
        int n = scanner.nextInt();

        int[] tabla = new int[15];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (i + 1) * n;
        }

        System.out.println("Tabla de " + n + ":");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println((i + 1) + " * " + n + " = " + tabla[i]);
        }

        System.out.print("Ingrese un numero para buscar en la tabla: ");
        int numeroBuscado = scanner.nextInt();

        int posicion = buscarNumero(tabla, numeroBuscado);

        if (posicion > 0) {
            System.out.println("El número " + numeroBuscado + " está en la posición " + posicion + " de la tabla.");
        } else {
            System.out.println("Error: El número buscado no es múltiplo de " + n);
        }
    }

    private static int buscarNumero(int[] tabla, int numeroBuscado) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == numeroBuscado) {
                return i + 1;
            }
        }
        return -1; 
    }
}
