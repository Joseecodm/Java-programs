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
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
         Scanner socio = new Scanner(System.in);

        // Ingreso de la categoría y antigüedad del socio
        System.out.print("Ingrese la categoria del socio (A, B o C): ");
        char categoria = socio.next().charAt(0);
        
        System.out.print("Ingrese la antiguedad del socio en años: ");
        int antiguedad = socio.nextInt();

        if (categoria == 'A' || (antiguedad >= 10 && antiguedad <= 18)) {
            System.out.println("Socio vip");
        } else {
            System.out.println("No es socio vip");
        }

    }
}
