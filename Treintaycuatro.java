/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompendioPrograms;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Treintaycuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numu, numa, arbi, ru, ra;

        System.out.println("Bienvenido al juego de adivinar el número más cercano.");
        System.out.println("La máquina generará un número aleatorio entre 1 y 100.");

        ru = random.nextInt(100) + 1;  // Generar número aleatorio para el usuario
        ra = random.nextInt(100) + 1;  // Generar número aleatorio para la máquina

        System.out.print("Ingrese su número: ");
        numu = scanner.nextInt();

        arbi = Math.abs(ra - numu);  // Calcular la diferencia absoluta entre los números

        if (arbi == 0) {
            System.out.println("¡Empate! Ambos han adivinado el número con la misma cercanía.");
        } else if (arbi <= 10) {
            System.out.println("¡Felicidades! Ha ganado el usuario. Su número está más cerca del generado por la máquina.");
        } else {
            System.out.println("La máquina ha ganado. Su número está más cerca del generado por la máquina: " + ra);
        }
        
        scanner.close();
    }
}
