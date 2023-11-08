/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompendioPrograms;

/**
 *
 * @author Josee
 */
public class Diesiseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
// Diseñar un algoritmo que genere un número aleatorio del 10 al 50, lo muestre y luego calcule y muestre el mismo número disminuido en un 15%.
	
	double Porcentaje, resta;
	int min = 0;
        int max = 200;

        // Genera un número entero aleatorio en el rango [0, 200]
        int num = min + (int)(Math.random() * ((max - min) + 1));
	System.out.println("Número aleatorio generado: " + num ); 
	
	Porcentaje = (.15);
	resta = num - (num * Porcentaje / 100);
	
	System.out.println("Número disminuido en un 15%:" + resta);
    }
    
}
