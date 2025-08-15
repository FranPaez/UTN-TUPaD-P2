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
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int notaUsuario;
        
        do {
            System.out.println("Ingrese una nota (0-10):");
            notaUsuario = scan.nextInt();
            
            if (notaUsuario >= 0 && notaUsuario <= 10){
                System.out.println("Nota guardada correctamente");
            }else{
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            } while (notaUsuario > 10 || notaUsuario < 0);
    
    }       
    
}
