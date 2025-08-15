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
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            int num = scan.nextInt();
            if (num > 0){
                positivos += 1;
            }else if (num < 0){
                negativos += 1;
            }else{
                ceros += 1;
            }
        }
        System.out.println("Resultados:\nPositivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros);
    }
}