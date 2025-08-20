package programación.estructurada;

import java.util.Scanner;

public class EjercicioDoce {
    
    public static void main(String[] args) {
        double[] arrayPrecios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (int i = 0; i < arrayPrecios.length; i++) {
            System.out.println("Precio: $" + arrayPrecios[i]);
        }
        arrayPrecios[2] = 129.99;
        System.out.println("Precios modificados:");
        for (int i = 0; i < arrayPrecios.length; i++) {
            System.out.println("Precio: $" + arrayPrecios[i]);
        }
    }
}