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
public class Veinteycinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double hombres, mujeres, total, porcentajeHombres, porcentajeMujeres;
        
        System.out.print("Ingrese el número total de hombres: ");
        hombres = scanner.nextDouble();
        
        System.out.print("Ingrese el número total de mujeres: ");
        mujeres = scanner.nextDouble();
        
        total = hombres + mujeres;
        
        if (total > 0) {
            porcentajeHombres = (hombres / total) * 100;
            porcentajeMujeres = (mujeres / total) * 100;
            
            System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
            System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        } else {
            System.out.println("El número total debe ser mayor que cero.");
        }    
    }
    
}
