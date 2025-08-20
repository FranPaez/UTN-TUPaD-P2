package programación.estructurada;

import java.util.Scanner;


public class EjercicioTres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edadUsuario = scan.nextInt();
        
        if (edadUsuario < 0) {
            System.out.println("Ingrese una edad válida.");
        } else if (edadUsuario < 12) {
            System.out.println("Niño");
        } else if (edadUsuario <= 17) {
            System.out.println("Adolescente");
        } else if (edadUsuario <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
    }       
}