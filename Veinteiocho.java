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
public class Veinteiocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la longitud del primer lado: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese la longitud del segundo lado: ");
        int b = scanner.nextInt();
        
        System.out.print("Ingrese la longitud del tercer lado: ");
        int c = scanner.nextInt();
        
        if (a > 0 && b > 0 && c > 0) {
            if (a != b && a != c && b != c) {
                System.out.println("El triángulo es escaleno.");
            } else if (a == b && a == c) {
                System.out.println("El triángulo es equilátero.");
            } else {
                System.out.println("El triángulo es isósceles.");
            }
        } else {
            System.out.println("Los lados del triángulo deben tener longitudes positivas.");
        }
    }
}
