package ejercicio_cuatro;


public class Ejercicio_Cuatro {


    public static void main(String[] args) {
        Cliente cliente = new Cliente("Franco", "12345678");
        Banco banco = new Banco("BBVA Frances", "33123456785");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1111 2222 3333", "10/28", banco, cliente);
        cliente.setTarjeta(tarjeta);
        System.out.println(tarjeta);
    }
    
}
