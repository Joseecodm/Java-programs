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
public class Diesioocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Diseñe un algoritmo para ingresar dos palabras (A, B) y luego realice el intercambio de sus valores. Finalmente mostrar el contenido de A y de B.
	
	char Aux, a, b;
        Scanner da = new Scanner(System.in); 
	
	System.out.println( "Ingrese la primera palabra (A):");
	a = da.next().charAt(0);
	
	System.out.println( "Ingrese la segunda palabra (B):");
	b = da.next().charAt(0);
	
	Aux = a;
	a = b;
	b = Aux;
	
	System.out.println( "Después del intercambio:");
	System.out.println( "A:" + a);
	System.out.println( "B:" + b);
}
}
