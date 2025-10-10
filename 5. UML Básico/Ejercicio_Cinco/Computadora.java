package ejercicio_cinco;


public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;

    public Computadora(String marca, String numeroSerie, Propietario propietario, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        this.placaMadre = placaMadre;
    }

    public void setPropietario(Propietario propietario) {
        if (this.propietario != propietario) {
            this.propietario = propietario;
            if (propietario != null && propietario.getComputadora() != this) {
                propietario.setComputadora(this);
            }
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "Computadora: " + marca + ", numero de serie: " + numeroSerie + "\n" + propietario.toString() + "\n" + placaMadre.toString();
    }
    
    
    
}
