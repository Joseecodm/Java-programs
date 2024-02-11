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
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        char categoria;
        int  antiguedad;
    
        Scanner vip = new Scanner(System.in);
        
        System.out.println("Ingrese la categoría del socio (A, B o C): "); 
        categoria = vip.next().charAt(0);
        System.out.println("Ingrese la antigüedad del socio en años: ");
        antiguedad = vip.nextInt();
    
         if (antiguedad >= 10 && antiguedad <= 18) {
         System.out.println("Eres socio vip");
          }
    }
}