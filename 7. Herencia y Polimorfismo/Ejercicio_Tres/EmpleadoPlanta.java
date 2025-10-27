package herencia_y_polimorfismo;

public class EmpleadoPlanta extends Empleado{
    
    
    
    @Override
    public double calcularSueldo() {
        return SUELDO_BASE;
    }


}
