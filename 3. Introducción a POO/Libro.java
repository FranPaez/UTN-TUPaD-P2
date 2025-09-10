package introduccion_poo;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    void mostrarInfo(){
        System.out.println("Titulo: "+ titulo + ", Autor: " + autor + ", Anio de publicacion: " + anioPublicacion);
}
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0){
            this.anioPublicacion = anioPublicacion;
    }
    }
    
}
