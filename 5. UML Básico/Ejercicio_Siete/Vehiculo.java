package ejercicio_siete;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor.getVehiculo() != this) {
        conductor.setVehiculo(this);
    }
}
    

    @Override
    public String toString() {
        return "Vehiculo: " + "\nPatente: " + patente + ", modelo: " + modelo + "\n" + motor.toString() + "\n" +  conductor.toString();
    }

    
    
}
