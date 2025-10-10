package ejercicio_cuatro;


public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
    }

    public void setCliente(Cliente cliente) {
    this.cliente = cliente;
    if (cliente.getTarjeta() != this) {
        cliente.setTarjeta(this);
    }
}

    public Cliente getCliente() {
        return cliente;
    }
    
    
    @Override
    public String toString() {
        return "Numero de tarjeta: " + numero + ", fecha de vencimiento: " + fechaVencimiento +  "\n" + banco.toString() + "\n" + cliente.toString();
    }
    
    
    
    
}
