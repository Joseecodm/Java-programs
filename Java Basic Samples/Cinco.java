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
public class Cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        double hipotenusa, a, b;
       
    
        Scanner aper =  new Scanner(System.in);
        
        System.out.println("Ingrese la base del triángulo rectángulo (cateto b): "); 
        b = aper.nextFloat();
        System.out.println( "Ingrese la altura del triángulo rectángulo (cateto a): ");
        a = aper.nextFloat();
        
        hipotenusa = (Math.sqrt(Math.pow(a, 2.0))+(Math.pow(b, 2.0)) );
                
        System.out.println("La hipotenusa del triángulo rectángulo es: " +  hipotenusa);
    }
}
