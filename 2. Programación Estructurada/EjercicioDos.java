package programación.estructurada;

import java.util.Scanner;


public class EjercicioDos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero ");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero ");
        int num2 = scan.nextInt();
        System.out.println("Ingrese el tercer numero ");
        int num3 = scan.nextInt();
        int mayor = num1;
        
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }
        System.out.println("El mayor es: " + mayor);
    }       
}

