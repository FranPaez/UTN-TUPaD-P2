package ejercicio_once;

public class Ejercicio_Once {
    public static void main(String[] args) {
        Artista artista = new Artista("Soda Stereo", "Rock");
        Cancion cancion = new Cancion("De Música Ligera", artista);
        Reproductor reproductor = new Reproductor();
        
        reproductor.reproducir(cancion);
    }
}
