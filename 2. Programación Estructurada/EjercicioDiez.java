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
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el stock actual: ");
        int stockActual = scan.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();
        
        int stockFinal = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es de " + stockFinal);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int stockActualizado = stockActual - cantidadVendida + cantidadRecibida;
        return stockActualizado;
    }
}