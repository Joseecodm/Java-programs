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
public class Veinteyuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Crear un algoritmo que convierta y muestre un valor ingresado en centímetros a yardas, metros, pies y pulgadas. 
	
    double cm, Yr, m, pies, pulgadas;
    Scanner s = new Scanner(System.in);
    System.out.println( "Ingrese la longitud en centímetros: ");
    cm = s.nextDouble();
	
    Yr = cm / 91.44;  // 1 yarda = 91.44 centímetros
    m = cm / 100;    // 1 metro = 100 centímetros
    pies = cm / 30.48;  // 1 pie = 30.48 centímetros
    pulgadas = cm / 2.54;  // 1 pulgada = 2.54 centímetros
	
    System.out.println( "Longitud en yardas: "+ Yr);
    System.out.println( "Longitud en metros: "+ m);
    System.out.println( "Longitud en pies: "+ pies);
    System.out.println( "Longitud en pulgadas: "+ pulgadas);
    }
}
