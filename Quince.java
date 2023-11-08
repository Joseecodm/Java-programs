/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompendioPrograms;

/**
 *
 * @author Josee
 */
public class Quince {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Diseñar un algoritmo que genere un número aleatorio del 0 al 200, lo muestre y luego calcule y muestre el mismo número aumentado en un 30%.
	
	double Porcentaje, suma;
	int min = 0;
        int max = 200;

        // Genera un número entero aleatorio en el rango [0, 200]
        int numeroAleatorio = min + (int)(Math.random() * ((max - min) + 1));
	System.out.println("Número aleatorio generado: " + numeroAleatorio ); 
	
	Porcentaje = (0.3);
	suma = numeroAleatorio + (numeroAleatorio * Porcentaje / 100);
	
	System.out.println( "Número aumentado en un 30%: " +  suma);
    }
    
}
