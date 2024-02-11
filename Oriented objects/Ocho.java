
package unidimensional;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Josee
 */
public class Ocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        Random datorandom = new Random();
        
        
        System.out.println("Teclea la cantidad de datos que deaseas ingresar");
        int cantidad = scan.nextInt();
        
        int[] datos = new int[cantidad];
        
        for(int introducir=0; introducir<datos.length; introducir++)
        {
            datos[introducir] = datorandom.nextInt(27)+10;

        }
        
        for(int escribir=0; escribir<datos.length; escribir++)
        {
            System.out.println(datos[escribir]);;
            
        }
        
    }
    
}
