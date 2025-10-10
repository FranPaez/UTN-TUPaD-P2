package ejercicio_dos;

public class Ejercicio_Dos {

    public static void main(String[] args) {
        Bateria bateria = new Bateria("S25 Ultra", "5000");
        Usuario usuario = new Usuario("Franco", "12345678");
        Celular celular = new Celular("33351", "Samsung", "S25 Ultra", bateria, usuario);
        usuario.setCelular(celular);
        System.out.println(celular);
        
        
    }
    
}
