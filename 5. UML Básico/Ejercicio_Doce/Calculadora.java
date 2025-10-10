package ejercicio_doce;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de " + impuesto.getContribuyente() + " por $" + impuesto.getMonto());
    }
}
