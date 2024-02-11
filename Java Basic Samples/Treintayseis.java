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
public class Treintayseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int estudiantes, covid = 0, normal = 0;

        System.out.print("Ingrese la cantidad de estudiantes en el salón: ");
        estudiantes = scanner.nextInt();

        for (int indice = 1; indice <= estudiantes; indice++) {
            System.out.print("Ingrese la temperatura del estudiante " + indice + " en grados Celsius: ");
            double comp = scanner.nextDouble();

            if (comp >= 38.0) {
                System.out.println("El estudiante " + indice + " tiene fiebre alta (mayor o igual a 38°C) y es sospechoso de COVID-19.");
                covid++;
            } else {
                System.out.println("El estudiante " + indice + " tiene una temperatura normal (menor a 38°C).");
                normal++;
            }
        }

        System.out.println("Total de estudiantes con fiebre alta (sospechosos de COVID-19): " + covid);
        System.out.println("Total de estudiantes con temperaturas normales: " + normal);
        
   
    }
}