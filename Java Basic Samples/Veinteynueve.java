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
public class Veinteynueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el resultado de la jugada de ruleta (0 al 36): ");
        int numero = scanner.nextInt();
        
        if (numero >= 0 && numero <= 36) {
            if (numero >= 1 && numero <= 12) {
                System.out.println("El número está en la primera docena.");
            } else if (numero >= 13 && numero <= 24) {
                System.out.println("El número está en la segunda docena.");
            } else {
                System.out.println("El número está en la tercera docena.");
            }
        } else {
            System.out.println("El número debe estar en el rango de 0 a 36.");
        }
     
    }
}