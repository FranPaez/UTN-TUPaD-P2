package ejercicio_tres;

public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor: " + nombre + ", nacionalidad: " + nacionalidad;
    }
    
    
    
}
