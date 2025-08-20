package programación.estructurada;

import java.util.Scanner;

public class EjercicioSiete {

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
