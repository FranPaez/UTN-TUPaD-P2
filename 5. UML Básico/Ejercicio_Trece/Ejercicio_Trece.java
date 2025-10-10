package ejercicio_trece;

public class Ejercicio_Trece {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Franco", "franco@mail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("https://www.google.com", usuario);
    }
}
