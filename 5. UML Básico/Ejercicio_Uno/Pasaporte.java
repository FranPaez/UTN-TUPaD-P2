package ejercicio_uno;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        setTitular(titular);
    }
    
    public void setTitular(Titular titular) {
        if (this.titular != titular) {
            this.titular = titular;
            if (titular != null && titular.getPasaporte() != this) {
                titular.setPasaporte(this);
            }
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return "Pasaporte: " + "numero: " + numero + ", fecha de emision: " + fechaEmision + "\nFoto: " + foto.toString() + "\nTitular: " + titular.getNombre() + ", DNI: " + titular.getDni();
    }
    
    
    
}
