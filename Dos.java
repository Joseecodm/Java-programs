/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompendioPrograms;
import java.util.Scanner;
/**
 *
 * @author Josee
 */
public class Dos {

    public static void main(String args[]) {

        int num;
        
        Scanner naturales =  new Scanner(System.in); 
        
        System.out.println( "Ingrese un número natural: ");
        num = naturales.nextInt();
    
    
        if (num >= 1 && num <= 20) {
           System.out.println("El número pertenece a la primera docena de los números naturales.");
        }
            else { 
                System.out.println("El número no pertenece a la primera docena de los números naturales.");
                    } 
    }

}
