package coleccciones;

public class Coleccciones {

    public static void main(String[] args) {
        
        // Iniciamos la biblioteca
        
        Biblioteca biblioteca = new Biblioteca();
        
        // Creamos los autores
        
        Autor autor1 = new Autor("1", "Franco", "Argentino");
        Autor autor2 = new Autor("2", "John", "Ingles");
        Autor autor3 = new Autor("3", "Ignacio", "Espaniol");
        
        // Agregamos 5 libros asociados a alguno de los Autores a la biblioteca.
        
        Libro libro1 = new Libro("123456", "Noche de Invierno", 2005, autor1);
        Libro libro2 = new Libro("321645", "Noche de Verano", 2003, autor2);
        Libro libro3 = new Libro("444444", "Noche de Otonio", 2000, autor1);
        Libro libro4 = new Libro("222222", "Noche de Primavera", 1995, autor3);
        Libro libro5 = new Libro("654321", "Dia de Invierno", 1985, autor3);
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        
        // Listamos todos los libros con su información y la del autor.
        
        biblioteca.listarLibros();
        
        // Buscamos un libro por su ISBN y mostrar su información
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println(biblioteca.buscarLibroPorIsbn("123456"));
        
        
        // Filtramos y mostramos los libros publicados en un año específico.
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println(biblioteca.filtrarLibrosPorAnio(2000));
        
        // Eliminamos un libro por su ISBN y listar los libros restantes.
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Libro a eliminar: Dia de Invierno");
        biblioteca.eliminarLibro("654321");
        biblioteca.listarLibros();
        
        // Mostramos la cantidad total de libros en la biblioteca.
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Cantidad de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());
        
        // Listamos todos los autores de los libros disponibles en la biblioteca
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println(biblioteca.mostrarAutoresDisponibles());
        
        
        
        
        
        
        
    }
    
}
