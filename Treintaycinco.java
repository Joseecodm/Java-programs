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
public class Treintaycinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String texto1;
        int nlong, ultima;

        System.out.print("Ingrese una palabra: ");
        texto1 = scanner.nextLine();

        nlong = texto1.length();  // Calcula la longitud de la cadena

        if (nlong > 0) {
            ultima = nlong;
            System.out.println("La palabra " + texto1 + " tiene " + nlong + " letras.");
        } else {
            System.out.println("La palabra está vacía.");
        }
  
    }
    
}
