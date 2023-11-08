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
public class Veinteytres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	//Diseñar un algoritmo que calcule el volumen de uno cilindro, dados su radio y altura (primero el programa deberá verificar si son positivas).
	
    double r, h, volumen;
    Scanner s = new Scanner(System.in);
    
    System.out.println( "Ingrese el radio del cilindro: ");
    r = s.nextDouble();
	
    System.out.println( "Ingrese la altura del cilindro: ");
    h = s.nextDouble();
	
    if (r > 0 && h > 0){
        
        volumen = 3.1415 * Math.pow(r,  2) * h;
        System.out.println( "El volumen del cilindro es:" + volumen);
    }
    else
    {
        System.out.println( "El radio y la altura deben ser valores positivos.");
    }
}    
}
