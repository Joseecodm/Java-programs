
package unidimensional;

import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crea un programa en Javaen el que se pida por consola el nombre de "N" alumnos y  genera la azar  la calificacion promedio de cada uno de ellos como valor numérico. El resultado que debe mostrarse es el nombre de cada alumno, su nota y su calificacion como texto (Sobresaliente, Notable, Bien o Suspenso).
        // Para ello crea un array numérico y otro de String (ambos unidimensionales). En el array numérico se insertarán las calificaciones generadas al azar  entre 4 y 10 (debemos controlar que inserte una nota valida), pudiendo ser decimal. En el array de Strings se insertarán los nombres de los alumnos.
        // Crea también un array de String donde insertaremos el resultado de la nota con palabras admitiéndose estos valores: Sobresaliente, Notable, Bien o Suspenso.
        // El programa debe comprobar la nota de cada alumno teniendo en cuenta esta equivalencia:
        // Si la nota está entre 4 y 6 será un insuficiente
        // Si la nota está entre 7 y 8 será un Bueno
        // Si la nota está entre 9 y 10 será un Execelente
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de alumnos: ");
        int numAlumnos = scanner.nextInt();

        // Arrays para almacenar las calificaciones, nombres y resultados de cada alumno
        double[] calificaciones = new double[numAlumnos];
        String[] nombres = new String[numAlumnos];
        String[] resultados = new String[numAlumnos];

        // Generar calificaciones aleatorias y solicitar nombres
        for (int i = 0; i < numAlumnos; i++) {
            // Generar calificación aleatoria entre 4 y 10
            calificaciones[i] = 4 + Math.random() * 6;
            
            // Solicitar nombre del alumno
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            // Calcular resultado de la calificación
            resultados[i] = obtenerResultado(calificaciones[i]);
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Nombre: " + nombres[i] + ", Nota: " + calificaciones[i] + ", Resultado: " + resultados[i]);
        }

        scanner.close();
    }

    // Método para obtener el resultado de la calificación
    private static String obtenerResultado(double calificacion) {
        if (calificacion >= 4 && calificacion < 6) {
            return "Insuficiente";
        } else if (calificacion >= 6 && calificacion < 7) {
            return "Suficiente";
        } else if (calificacion >= 7 && calificacion < 9) {
            return "Bueno";
        } else if (calificacion >= 9 && calificacion <= 10) {
            return "Excelente";
        } else {
            return "Nota no válida";
        }
    
    }
    
}
