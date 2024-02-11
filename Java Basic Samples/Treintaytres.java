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
public class Treintaytres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n, nu, intentos;

        System.out.println("Bienvenido al Juego de la Papa Caliente");
        System.out.print("Ingresa el número al que debes atinar: ");
        n = scanner.nextInt();
        System.out.println("Empieza a adivinar. Tienes 10 intentos.");

        intentos = 10;

        while (intentos > 0) {
            System.out.print("Ingresa un número: ");
            nu = scanner.nextInt();

            if (nu == n) {
                System.out.println("¡Felicidades! Adivinaste el número.");
                break;
            } else {
                intentos--;

                if (intentos > 0) {
                    System.out.println("Número incorrecto. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Lo siento, te quedaste sin intentos. El número era " + n + ".");
                }
            }
        }
    }
}