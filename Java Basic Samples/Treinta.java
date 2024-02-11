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
public class Treinta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el puntaje del primer jugador: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Ingrese el puntaje del segundo jugador: ");
        int n2 = scanner.nextInt();
        
        System.out.print("Ingrese el puntaje del tercer jugador: ");
        int n3 = scanner.nextInt();
        
        if (n1 > n2 && n1 > n3) {
            System.out.println("El primer jugador es el ganador con un puntaje de " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El segundo jugador es el ganador con un puntaje de " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("El tercer jugador es el ganador con un puntaje de " + n3);
        } else {
            System.out.println("Hay un empate.");
        }
  
    }
}