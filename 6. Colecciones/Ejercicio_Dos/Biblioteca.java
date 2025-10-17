package coleccciones;
import java.util.List;
import java.util.ArrayList;


public class Biblioteca {

    private String nombre;
    private List<Libro> libros = new ArrayList<>();
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    public void listarLibros(){
        for (Libro l : libros) {
            System.out.println("ISBN: " + l.getIsbn() + "\nTitulo: " + l.getTitulo());
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
       for (Libro l : libros){
           if (l.getIsbn().equals(isbn)){
               return l;
           }
       } return null;
   }
       
    public boolean eliminarLibro(String isbn){
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null){
            libros.remove(encontrado);
            return true;
        } return false;
    }

    public int obtenerCantidadLibros(){
        int acum = 0;
        for (Libro l : libros) {
            if (libros == null) return 0;
            if (l != null){
            acum += 1;
            }
        } return acum;
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        ArrayList <Libro> filtrados = new ArrayList<>();
        for (Libro f : libros) {
            if (f.getAnioPublicacion() == anio){
                filtrados.add(f);
            }
        } return filtrados;
    }
    
    public ArrayList<Autor> mostrarAutoresDisponibles(){
        ArrayList <Autor> autores = new ArrayList<>();
        for (Libro l : libros){
            Autor autor = l.getAutor();
            if (!autores.contains(autor)){
                autores.add(autor);
            }
        } return autores;
    }


}

