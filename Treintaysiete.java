/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompendioPrograms;
import java.util.Scanner;
/**
 *
 * @author Josee
 */
public class Treintaysiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n_ap_A, n_ap_B, sumaA = 0, sumaB = 0;
        double promA, promB;

        System.out.print("Ingrese la cantidad de estudiantes en el grupo A: ");
        n_ap_A = scanner.nextInt();

        for (int i = 1; i <= n_ap_A; i++) {
            System.out.print("Ingrese la calificación del estudiante " + i + " en el grupo A: ");
            int grupoA = scanner.nextInt();
            sumaA += grupoA;
        }

        System.out.print("Ingrese la cantidad de estudiantes en el grupo B: ");
        n_ap_B = scanner.nextInt();

        for (int i = 1; i <= n_ap_B; i++) {
            System.out.print("Ingrese la calificación del estudiante " + i + " en el grupo B: ");
            int grupoB = scanner.nextInt();
            sumaB += grupoB;
        }

        promA = (double) sumaA / n_ap_A;  // Calculamos el promedio del grupo A
        promB = (double) sumaB / n_ap_B;  // Calculamos el promedio del grupo B

        System.out.println("Promedio del grupo A: " + promA);
        System.out.println("Promedio del grupo B: " + promB);

        if (promA > promB) {
            System.out.println("El grupo A tiene un mejor promedio.");
        } else if (promB > promA) {
            System.out.println("El grupo B tiene un mejor promedio.");
        } else {
            System.out.println("Ambos grupos tienen el mismo promedio.");
        }
    }
}