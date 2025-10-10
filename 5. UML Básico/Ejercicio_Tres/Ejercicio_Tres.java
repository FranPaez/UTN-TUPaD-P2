package ejercicio_tres;


public class Ejercicio_Tres {


    public static void main(String[] args) {
        Autor autor = new Autor("JK Rowling", "britanica");
        Editorial editorial = new Editorial("Salamandra", "Calle falsa 123");
        Libro libro = new Libro("Harry Potter y la Piedra Filosofal", "132564", editorial, autor);
        System.out.println(libro);
    }       
}
