package ejercicio_ocho;

public class Ejercicio_Ocho {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Franco", "franco@mail.com");
        Documento doc = new Documento("Contrato", "Contenido del contrato", usuario);

        System.out.println(doc);
    }
}
