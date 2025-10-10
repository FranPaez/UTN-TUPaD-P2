package ejercicio_nueve;

public class Profesional {
    private String nombre;
    private String profesionalidad;

    public Profesional(String nombre, String profesionalidad) {
        this.nombre = nombre;
        this.profesionalidad = profesionalidad;
    }

    @Override
    public String toString() {
        return "Profesional: " + nombre + ", especialidad: " + profesionalidad;
    }
    
    
}
