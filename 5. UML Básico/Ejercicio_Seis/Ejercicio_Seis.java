package ejercicio_seis;


public class Ejercicio_Seis {


    public static void main(String[] args) {
        Cliente cliente = new Cliente("Franco", "1133552288");
        Mesa mesa = new Mesa(5, 6);
        Reserva reserva = new Reserva("09/10/2025", "21:00", mesa, cliente);
        System.out.println(reserva);
    }       
}
