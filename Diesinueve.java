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
public class Diesinueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Diseñar un algoritmo que imprima el área y el perímetro de un rectángulo ingresando su base y altura.
	
    double base, altura, area, perimetro; 
    Scanner s =  new Scanner(System.in);
	
    System.out.println(  "Ingrese la base del rectángulo: ");
     base = s.nextDouble();
	
    System.out.println(  "Ingrese la altura del rectángulo: ");
     altura = s.nextDouble();
	
    area = base * altura;
    perimetro = 2 * (base + altura);
	
    System.out.println(  "El área del rectángulo es:" + area);
    System.out.println(  "El perímetro del rectángulo es:" + perimetro);
    }
    
}
