package poo;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    
    // ---------- Creación de los constructores ----------
    
    // Recibe todos los atributos como parametros

    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados ++;
        this.id = id + totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    // Recibe nombre y puesto. Asigna ID automatico y un salario por defecto

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000;
        totalEmpleados ++;
        this.id = totalEmpleados;
    }
    
    // ---------- Creacion de los Métodos ----------
    
    
   // Metodo actualizarSalario con porcentaje
    
    double actualizarSalario(double porcentajeAumento){
        salario = salario + (salario * porcentajeAumento / 100);
        return salario;
    }
    
   // Metodo actualizarSalario con cantidad fija
    
    double actualizarSalario(int cantidadAumento){
        salario = salario + cantidadAumento;
        return salario;
    }
    
    @Override
    public String toString() {
        return "Empleado: " + "id = " + id + ", nombre = " + nombre + ", puesto = " + puesto + ", salario = " + salario + '}';
    }
    
    static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    // ---------- Getters y Setters ----------
    
    // Getters
    
    public int getId(){
        return id;
    }
    
    public String nombre(){
        return nombre;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public double getSalario(){
        return salario;
    }
    
    
   // Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    
    
    
    
    
    
    
    
}
