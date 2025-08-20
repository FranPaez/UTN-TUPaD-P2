package programación.estructurada;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        scan.nextLine(); 
        System.out.println("Ingrese la categoría del producto (A, B, C): ");
        char cat = Character.toUpperCase(scan.nextLine().charAt(0));
        double descuento = 0;
        
        switch (cat) {
            case 'A':
                descuento = precio * 10 / 100;
                break;
            case 'B':
                descuento = precio * 15 / 100;
                break;
            case 'C':
                descuento = precio * 20 / 100; 
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }
        
        double precioFinal = precio - descuento;
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Precio final: " + precioFinal);
    }
}