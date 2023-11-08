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
public class Cuarenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double descuento = 0.15;  // Descuento del 15%
        double producto;

        System.out.print("Ingrese el valor del producto: ");
        producto = scanner.nextDouble();

        if (producto > 0) {
            double precioConDescuento = producto - (producto * descuento);
            System.out.println("El precio con descuento del 15% es: " + precioConDescuento);
        } else {
            System.out.println("El valor del producto debe ser mayor que cero.");
        }

    }
}
