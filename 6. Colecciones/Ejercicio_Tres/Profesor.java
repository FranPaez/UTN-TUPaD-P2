package coleccciones;

import java.util.ArrayList;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    
    public void agregarCurso(Curso c){
        if (!cursos.contains(c)){
            cursos.add(c);
            if(c.getProfesor() != this){
                c.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso c){
        if (cursos.remove(c)){
            if(c.getProfesor() == this){
                c.setProfesor(null);
            }
        }
    }
    
    public void listarCursos(){
        if (cursos.isEmpty()){
            System.out.println("No hay cursos asignados");
        }else{
        for (Curso c : cursos) {
            System.out.println("Codigo: " + c.getCodigo() + "\nNombre: " + c.getNombre());
        }
        }
    }
    
    
    public int cantidadCursos(){
        return cursos.size();
    }
    
    public void cantidadCursosPorProfesor(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de cursos asignado: " + cantidadCursos());
    }
    
    public void mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cantidadCursos());
    }

    
}



