package introduccion_poo;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
            
    void mostrarInfo(){
        System.out.println("Nombre completo: " + nombre + " " + apellido + ", Curso: " + curso + ", Calificacion: " + calificacion);
}
    double subirCalificacion(double calificacionNueva){
        return calificacion += calificacionNueva;
    }
    
    double bajarCalificacion(double calificacionNueva){
        return calificacion -= calificacionNueva;
    }
}
