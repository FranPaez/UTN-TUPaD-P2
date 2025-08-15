/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programación.estructurada;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
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

