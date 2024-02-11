/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompendioPrograms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Treintayocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nj, puntaje = 0;

        System.out.print("Ingrese la cantidad de dados a lanzar: ");
        nj = scanner.nextInt();

        for (int indice = 1; indice <= nj; indice++) {
            System.out.println("Lanzando dado " + indice + "...");
            int d1 = random.nextInt(6) + 1;
            System.out.println("El resultado del dado " + indice + " es: " + d1);
            puntaje += d1;
        }

        System.out.println("El puntaje total obtenido en " + nj + " lanzamientos de dados es: " + puntaje);
            }
    
}
