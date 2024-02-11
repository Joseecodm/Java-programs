package CompendioPrograms;

import java.util.Scanner;
import java.math.MathContext;

/**
 * @author Josee
 */
public class Catorce {
    
    /**
     * @param args
     *
     * Este programa genera el valor al cuadrado de un numero y su elevacion
     * al cubo
     */
    
    public static void main(String args[]) {

        double num1, cuadrado, cubo;

        Scanner numero = new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        num1 = numero.nextDouble();

        cuadrado = Math.pow(num1, 2);
        cubo = Math.pow(num1, 3);
                
        System.out.println("El cuadrado de este numero es: " + cuadrado);
        System.out.println("El cubo de este numero es: " + cubo);
        
      
        
        
    }
}
