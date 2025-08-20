package programación.estructurada;

import java.util.Scanner;

public class EjercicioNueve {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el peso del producto: ");
        double peso = Double.parseDouble(scan.nextLine());
        System.out.println("Ingrese si el envio es nacional o internacional: ");
        String zona = scan.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        int precioProducto = Integer.parseInt(scan.nextLine());
        
        double envio = calcularEnvio(peso, zona);
        System.out.println("El total del envio es: " + envio);
        
        double totalCompra = calcularTotalCompra(precioProducto, envio);
        System.out.println("El total a pagar es: " + totalCompra);
    }

    public static double calcularEnvio (double peso, String zona) {
        double nacional = peso * 5;
        double internacional = peso * 10;
        double totalEnvio = 0;
    
        if (zona.equalsIgnoreCase("Nacional")){
            totalEnvio = nacional;
        }
        if (zona.equalsIgnoreCase("Internacional")){
            totalEnvio = internacional;
        }
        return totalEnvio;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}