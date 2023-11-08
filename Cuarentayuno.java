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
public class Cuarentayuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num8;

        System.out.print("Ingrese un valor numérico: ");
        num8 = scanner.nextInt();

        if (num8 % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado no es par.");
        }

    }
    
}
