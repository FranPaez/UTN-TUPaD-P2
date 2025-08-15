/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programación.estructurada;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sumaPares = 0;

        do {
            System.out.println("Ingrese un número (0 para terminar): ");
            num = scan.nextInt();
    
            if (num != 0 && num % 2 == 0) {
                sumaPares += num;
                }
    
        } while (num != 0);

        System.out.println("La suma de los números pares es: " + sumaPares);

    }
}