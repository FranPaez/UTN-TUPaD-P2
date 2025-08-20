package programación.estructurada;

import java.util.Scanner;

public class EjercicioCinco {

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