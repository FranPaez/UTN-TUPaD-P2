package ejercicio_dos;


public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
    }

    public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
    if (usuario.getCelular() != this) {
        usuario.setCelular(this);
    }
}

    public Usuario getUsuario() {
    return usuario;
}




    @Override
    public String toString() {
        return "Celular: " + "imei: " + imei + ", marca: " + marca + ", modelo: " + modelo + "\nBateria: " + bateria.toString() + "\nUsuario: " + usuario.toString();
    }
    
    
    
    
}
