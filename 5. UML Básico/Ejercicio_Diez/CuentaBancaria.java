package ejercicio_diez;


public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, double saldo, Titular titular, ClaveSeguridad claveSeguridad) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        this.claveSeguridad = claveSeguridad;
    }

    

    public void setTitular(Titular titular) {
        if (this.titular != titular) {
            this.titular = titular;
            if (titular != null && titular.getCuentaBancaria() != this) {
                titular.setCuentaBancaria(this);
            }
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta Bancaria: \nCBU: " + cbu + "\n" + titular.toString() + "\n" + claveSeguridad.toString();
    }

    
    
    
}
