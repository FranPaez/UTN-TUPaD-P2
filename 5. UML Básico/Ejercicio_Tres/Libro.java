package ejercicio_tres;


public class Libro {
    private String libro;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String libro, String isbn, Editorial editorial, Autor autor) {
        this.libro = libro;
        this.isbn = isbn;
        this.editorial = editorial;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro: " + libro + ", ISBN: " + isbn + "\n" + editorial.toString() + "\n" + autor.toString();
    }
    
    
    
}
