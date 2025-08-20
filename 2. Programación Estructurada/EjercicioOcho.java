package programación.estructurada;

import java.util.Scanner;

public class EjercicioOcho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = scan.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = scan.nextDouble();
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }
}

