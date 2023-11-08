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
public class Veinte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Realice un algoritmo que calcule el volumen de un cilindro a partir de los valores de su radio y altura. 
	
    double radio, altura, volumen, valorPi;
    Scanner s = new Scanner(System.in);
    valorPi = 3.141592653;
	
    System.out.println( "Ingrese el radio del cilindro: ");
     radio  = s.nextDouble();
	
    System.out.println( "Ingrese la altura del cilindro: ");
     altura = s.nextDouble();
	
    volumen = valorPi * Math.pow(radio, 2) * altura;
	
    System.out.println( "El volumen del cilindro es:" + volumen); 
    }
    
}
