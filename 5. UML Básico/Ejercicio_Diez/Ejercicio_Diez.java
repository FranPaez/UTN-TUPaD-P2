package ejercicio_diez;


public class Ejercicio_Diez {


    public static void main(String[] args) {
        ClaveSeguridad claveSeguridad = new ClaveSeguridad("123465", "10/25");
        Titular titular = new Titular("Franco", "12345678");
        CuentaBancaria cuenta = new CuentaBancaria("00012345678912345678", 0.0, titular, claveSeguridad);
        titular.setCuentaBancaria(cuenta);
        System.out.println(cuenta);
    }      
}
