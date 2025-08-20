package programación.estructurada;

import java.util.Scanner;

public class EjercicioTrece {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirPrecios(precios, 0);
    }

    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPrecios(precios, indice + 1); 
        }
    }
}
