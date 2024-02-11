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
public class Cuarentaydos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, contador;

        System.out.print("Ingrese un número de hasta 4 dígitos: ");
        n = scanner.nextInt();

        if (n >= 0 && n <= 9999) {
            contador = 0;

            if (n == 0) {
                contador = 1;
            } else {
                while (n > 0) {
                    n = n / 10;
                    contador++;
                }
            }

            System.out.println("El número ingresado tiene " + contador + " dígito(s).");
        } else {
            System.out.println("Número fuera del rango permitido. Ingrese un número de hasta 4 dígitos.");
        }

    }
}