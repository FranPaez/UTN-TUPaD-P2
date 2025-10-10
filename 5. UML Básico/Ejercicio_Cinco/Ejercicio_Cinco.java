package ejercicio_cinco;


public class Ejercicio_Cinco {


    public static void main(String[] args) {
        PlacaMadre placaMadre = new PlacaMadre("ASUS", "AM4");
        Propietario propietario = new Propietario("Franco", "12345678");
        Computadora PC = new Computadora("HP", "20102017", propietario, placaMadre);
        propietario.setComputadora(PC);
        System.out.println(PC);
    }      
}
