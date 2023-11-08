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
public class Veniteyseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        double num1 = scanner.nextDouble();
        
        if (num1 > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (num1 < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es nulo (cero).");
        }
  
    }
    
}
