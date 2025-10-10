package ejercicio_siete;


public class Ejercicio_Siete {


    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "123");
        Conductor conductor = new Conductor("Franco", true);
        Vehiculo vehiculo = new Vehiculo("BA321CD", "Etios", motor, conductor);
        conductor.setVehiculo(vehiculo);
        System.out.println(vehiculo);
    }
    
}
