package poo;

public class POO {

    public static void main(String[] args) {

        // Creacion Empleado con todos los parametros
        
        Empleado emp1 = new Empleado(0, "Franco", "Backend", 1000);
        Empleado emp2 = new Empleado(0, "Fernando", "Frontend", 1000);

        // Creacion Empleado con dos parametros
        
        Empleado emp3 = new Empleado("Marcos", "Cybersecurity");
        Empleado emp4 = new Empleado("Martin", "Data Analytic");
        
        // Verificacion de aumento de totalEmpleados, esto se verifica mediante el ID. 
        // Mostrar el totalEmpleados solo nos mostrara el ultimo ID creado 
        
        System.out.println(emp1.getId());
        System.out.println(emp2.getId());
        System.out.println(emp3.getId());
        System.out.println(emp4.getId());
        
        // Uso del método actualizarSalario()
        
        emp3.actualizarSalario(10.0); // 10% de aumento sobre 1000. Se coloca el .0 por ser double
        emp4.actualizarSalario(200); // Cantidad fija, aumenta 200, no se coloca el .0 por ser int
        
        System.out.println(emp3.getSalario());
        System.out.println(emp4.getSalario());
        
        // Mostrar a traves de ToString el empleado de forma legible
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        // Mostrar total empleados con metodo mostrarTotalEmpleados
        
        System.out.println("El total de empleados creados es de: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
