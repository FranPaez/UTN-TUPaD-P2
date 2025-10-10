package ejercicio_ocho;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital("HASH123", "01/10/2025", usuario);
    }

    @Override
    public String toString() {
        return "Documento: " + titulo + ", contenido: " + contenido + "\n" + firma.toString();
    }
}
