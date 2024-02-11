/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CompendioPrograms;
import java.util.Scanner;
/**
 *
 * @author Josee
 */
public class Ocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Ingresar un número natural por teclado. Se desea saber y mostrar si es par o impar.
	
    int n, r;
    Scanner e = new Scanner (System.in);
    
    System.out.println("Ingrese un número natural:"); 
     n = e.nextInt();
	
     r = n % 2;
	
    if (r == 0){
         System.out.println( "El número " + n + " es PAR.");
    }else{
         System.out.println( "El número " + n + " es IMPAR.");
    }
    }
}
