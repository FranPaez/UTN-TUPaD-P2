package herencia_y_polimorfismo;

public class EmpleadoTemporal extends Empleado{
    
    @Override
    public double calcularSueldo() {
        return SUELDO_BASE / 10;
    }

    
}
