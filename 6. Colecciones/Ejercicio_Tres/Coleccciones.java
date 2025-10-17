package coleccciones;

public class Coleccciones {

    public static void main(String[] args) {
        
        // Iniciamos los profesores
        
        Profesor prof1 = new Profesor("1", "Ana Garcia", "Matematica");
        Profesor prof2 = new Profesor("2", "Luis Perez", "Programacion");
        Profesor prof3 = new Profesor("3", "Maria Lopez", "Historia");
        
        // Iniviamos los cursos
                
        Curso curso1 = new Curso("MAT-01", "Algebra");
        Curso curso2 = new Curso("PROG-01", "Java Basico");
        Curso curso3 = new Curso("HIS-01", "Historia Moderna");
        Curso curso4 = new Curso("PROG-02", "Java Avanzado");
        Curso curso5 = new Curso("MAT-02", "Calculo");
        
        // Iniciamos la universidad y asignamos los profesores y cursos
        
        Universidad univ = new Universidad("Universidad Nacional");
        univ.agregarProfesor(prof1);
        univ.agregarProfesor(prof2);
        univ.agregarProfesor(prof3);
        
        univ.agregarCurso(curso1);
        univ.agregarCurso(curso2);
        univ.agregarCurso(curso3);
        univ.agregarCurso(curso4);
        univ.agregarCurso(curso5);
        
        // Asignamos profesores a cursos usando asignarProfesorACurso(...)
        
        univ.asignarProfesorACurso("MAT-01", "1");
        univ.asignarProfesorACurso("MAT-02", "1");
        univ.asignarProfesorACurso("PROG-01", "2");
        univ.asignarProfesorACurso("PROG-02", "2");
        univ.asignarProfesorACurso("HIS-01", "3");

        
        // Listamos los cursos con sus profesores
        
        System.out.println("Listado de cursos con sus profesores: ");
        univ.listarCursos();
        
        // Listamos los profesores con sus cursos
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Listado de profesores con sus cursos: ");
        univ.listarProfesores();
        
        // Cambiamos el profesor de un curso y verificamos que ambos lados quedan sincronizados.
        
        System.out.println("\nProfesor a cambiar: Ana Garcia");
        univ.asignarProfesorACurso("1", "PROG-01");
        System.out.println("");
        System.out.println("Listado cursos actualizado: ");
        univ.listarCursos();
        System.out.println("");
        System.out.println("Listado profesores actualizado: ");
        univ.listarProfesores();
        
        // Removemos un curso y confirmamos que ya no aparece en la lista del profesor.
        
        System.out.println("\nCurso a eliminar: Java Avanzado | PROG-02");
        univ.eliminarCurso("PROG-02");
        System.out.println("");
        System.out.println("Listado cursos actualizado: ");
        univ.listarCursos();
        System.out.println("");
        System.out.println("Listado profesores actualizado: ");
        univ.listarProfesores();
   
        // Removemos un profesor y dejamos profesor = null
        
        System.out.println("\nProfesor a eliminar y dejar null: Ana Garcia");
        univ.eliminarProfesor("1");
        System.out.println("");
        System.out.println("Listado profesores actualizado: ");
        univ.listarProfesores();
        System.out.println("");
        System.out.println("Listado cursos actualizado: ");
        univ.listarCursos();
        
        // Mostrar un reporte: cantidad de cursos por profesor
        
        System.out.println("");
        System.out.println("Cantidad de cursos por profesor:");
        prof1.cantidadCursosPorProfesor();
        prof2.cantidadCursosPorProfesor();
        prof3.cantidadCursosPorProfesor();
        
        
    }
    
}
