package ejercicio_doce;

public class Ejercicio_Doce {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Franco", "20-12345678-5");
        Impuesto i = new Impuesto(15000, c);
        Calculadora calc = new Calculadora();

        calc.calcular(i);
    }
}
