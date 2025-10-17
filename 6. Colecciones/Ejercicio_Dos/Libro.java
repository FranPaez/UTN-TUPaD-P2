package coleccciones;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
       public void mostrarInfo(){
       System.out.println("ISBN: " + isbn + "\nTitulo: " + titulo + "\nAño de publicacion: " + anioPublicacion + "\nAutor: " + autor.getNombre());
   }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + "\nTitulo: " + titulo + "\nAnio de publicacion: " + anioPublicacion + "\nAutor: " + autor;
    }

   
    
}
