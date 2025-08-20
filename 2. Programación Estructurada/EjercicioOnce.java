package programación.estructurada;

import java.util.Scanner;


public class EjercicioOnce {
    
    static double descuento = 0.10;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese precio del producto: ");
        double precio = Double.parseDouble(scan.nextLine());
        double totalDescuento = calcularDescuentoEspecial(precio);
        double precioFinal = precio - totalDescuento;
        System.out.println("El descuento especial aplicado es de: " + totalDescuento + "\nEl precio final con descuento es: " + precioFinal);
    }

    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento;
        return descuentoAplicado;
    }

}