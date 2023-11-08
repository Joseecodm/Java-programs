
package CompendioPrograms;
import java.util.Scanner;
/**
 * @author Josee
 */
public class Diesisiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Enunciado: Diseñar un algoritmo que, dados tres números enteros, calcule e imprima el promedio entre ellos.
	
	double num1, num2, num3, promedio;
	Scanner dat = new Scanner(System.in);
        
	System.out.println("Ingrese el primer número:"); 
	num1 = dat.nextDouble();
	
        System.out.println("Ingrese el segundo número:"); 
	num2 = dat.nextDouble();
	
        System.out.println("Ingrese el tercer número:"); 
        num3 = dat.nextDouble();
	
	promedio = (num1 + num2 + num3) / 3 ;
	
	System.out.println( "El promedio de los tres números es:" + promedio);
}
}
