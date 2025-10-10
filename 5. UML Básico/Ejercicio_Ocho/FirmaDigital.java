package ejercicio_ocho;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; 

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Firma Digital: " + codigoHash + ", fecha: " + fecha + "\n" + usuario.toString();
    }
}
