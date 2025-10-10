package ejercicio_uno;

public class Ejercicio_Uno {

    public static void main(String[] args) {
        Foto foto = new Foto("foto.png", "png");
        Titular titular = new Titular("Franco", "12345678");
        Pasaporte pasaporte = new Pasaporte("AJJ35131", "20/10/2017", foto, titular);
        titular.setPasaporte(pasaporte);
        System.out.println(pasaporte);
    }
    
}
