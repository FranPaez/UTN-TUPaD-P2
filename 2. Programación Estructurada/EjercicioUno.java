package programación.estructurada;

import java.util.Scanner;


public class EjercicioUno {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anioUsuario = scan.nextInt();
        
        if (anioUsuario >= 1){
            if (anioUsuario % 400 == 0){
                System.out.println(anioUsuario + " es biciesto");
            }else if (anioUsuario % 100 == 0){
                System.out.println(anioUsuario + " no es bisiesto");
            }else if (anioUsuario % 4 == 0)
            {
                System.out.println(anioUsuario + " es biciesto");
            }else{
                System.out.println(anioUsuario + " no es biciesto");
            }
    }
    }
    
}

