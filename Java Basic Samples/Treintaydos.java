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
public class Treintaydos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int cal;
        double prom;

        for (int num = 1; num <= 10; num++) {
            System.out.print("Ingrese la calificación número " + num + ": ");
            cal = scanner.nextInt();
            suma += cal;
        }

        prom = (double) suma / 10;

        System.out.println("El promedio de las 10 calificaciones es: " + prom);
        
   
    }
}
  