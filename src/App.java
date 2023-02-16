/* 
 * Imports
*/

import java.util.Scanner;

/*
@authors:   Santiago Ayala
            David Ortiz 
            Francisco Guzmán 

*/

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de productos: ");
        int n = sc.nextInt();

        System.out.println("Ingrese el tamaño del buffer 1: ");
        int b1 = sc.nextInt();

        System.out.println("Ingrese el tamaño del buffer 2: ");
        int b2 = sc.nextInt();
    }
}
