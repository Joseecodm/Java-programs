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
public class Veinteycuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Crear un algoritmo que calcule si dos números son divisibles. Para ello, se piden un primer número y un segundo número, entonces mostrar un cartel que diga "es divisible" si el segundo número es divisible al primero.
	
    double num1, num2;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        num1 = s.nextDouble();
        
        System.out.println("Ingrese el segundo número: ");
        num2 = s.nextDouble();
        
        if (num2 != 0) {
            if (num1 % num2 == 0) {
                System.out.println("El primer número es divisible por el segundo.");
            } else {
                System.out.println("El primer número no es divisible por el segundo.");
            }
        } else {
            System.out.println("No se puede dividir por cero. Ingrese un segundo número diferente de cero.");
        }
    }
    
}
