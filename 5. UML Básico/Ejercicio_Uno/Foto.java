package ejercicio_uno;


public class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "imagen: " + imagen + ", formato: " + formato;
    }
    
    
}
