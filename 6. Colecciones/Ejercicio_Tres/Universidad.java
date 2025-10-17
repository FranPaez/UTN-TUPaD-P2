package coleccciones;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    
    public void agregarProfesor(Profesor p){
       profesores.add(p);
   }
    
    public void agregarCurso(Curso c){
        cursos.add(c);
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            System.out.println("Profesor: " + p.getNombre());
            for (Curso c : p.getCursos()) {
                System.out.println("   Curso: " + c.getNombre());
            }
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            String nombreProfesor = (c.getProfesor() != null) ? c.getProfesor().getNombre() : "Sin profesor";
            System.out.println("Curso: " + c.getNombre() + " | Profesor: " + nombreProfesor);
        }
    }
    
    public Profesor buscarProfesorPorId(String id){
        for (Profesor p : profesores) {
            if(p.getId().equals(id)){
                return p;
            }
        } return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo){
        for (Curso c : cursos) {
            if(c.getCodigo().equals(codigo)){
                return c;
            }
        } return null;
    }
    
    public boolean eliminarCurso(String codigo){
        Curso encontrado = buscarCursoPorCodigo(codigo);
        if (encontrado != null){
            if (encontrado.getProfesor() != null) {
                encontrado.setProfesor(null); 
            }
            cursos.remove(encontrado);
            return true;
        }
        return false;
    }

    public boolean eliminarProfesor(String id){
        Profesor encontrado = buscarProfesorPorId(id);
        if (encontrado != null){
            for (Curso c : new ArrayList<>(encontrado.getCursos())) {
                c.setProfesor(null); 
            }
            profesores.remove(encontrado);
            return true;
        }
        return false;
    }

}
