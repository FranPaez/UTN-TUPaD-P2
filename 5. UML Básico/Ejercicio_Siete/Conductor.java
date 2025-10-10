package ejercicio_siete;

public class Conductor {
    private String nombre;
    private boolean licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, boolean licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
    if (vehiculo.getConductor() != this) {
        vehiculo.setConductor(this);
    }
}


    @Override
    public String toString() {
        return "Conductor: " + nombre;
    }

    
}
