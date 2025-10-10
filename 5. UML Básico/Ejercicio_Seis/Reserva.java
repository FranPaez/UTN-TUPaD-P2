package ejercicio_seis;


public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva a nombre de: " + cliente.getNombre() + ", contacto: " + cliente.getTelefono() + "\nFecha y hora: " + fecha + " " + hora + "\n" + mesa.toString();
    }

    
    
    
    
}
