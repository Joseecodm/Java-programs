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
public class Veinteydos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//Diseñar un algoritmo que convierta y muestre la temperatura en Fahrenheit ingresando la temperatura en Celsius. 

    float Celsius, F;
    Scanner s = new Scanner(System.in);
    
    System.out.println( "Ingrese la temperatura en grados Celsius: ");
    Celsius = s.nextFloat();
	
    F = (Celsius * 9/5) + 32;
	
    System.out.println( "La temperatura en grados Fahrenheit es:" + F);
    }
    
}
