package ejercicio_diez;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "Codigo de seguridad: " + codigo + ", ultima modificacion: " + ultimaModificacion;
    }

    
    
    
}
