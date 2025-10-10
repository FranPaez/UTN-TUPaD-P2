package ejercicio_trece;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); 
        System.out.println("Generado: " + qr);
    }
}
