package ejercicio_tres;

public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Editorial: " + nombre + ", direccion: " + direccion;
    }
    
    
    
}
