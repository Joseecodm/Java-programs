package CompendioPrograms;
import java.util.Scanner;
public class Uno {

    public static void main(String args[]) {
        
        int res, n1, n2;
        
        Scanner d = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        n1 = d.nextInt();
        
        if (n1 < 0) {
            n1 = n1 * (-1);
        }
        
        System.out.println("Escribe el segundo numero: ");
        n2 = d.nextInt();
        
        if (n2 < 0) {
            n2 = n2 * (-1);
        }
        
        res = n1 + n2;
        System.out.println("El resultado es: " + res);

    }
}
