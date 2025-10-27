package herencia_y_polimorfismo;

public class Herencia_y_polimorfismo {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoPlanta();
        empleados[1] = new EmpleadoTemporal();

        for (Empleado e : empleados) {
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            System.out.println("Sueldo: $" + e.calcularSueldo());
            System.out.println("--------------------");
        }
    }
    
}
