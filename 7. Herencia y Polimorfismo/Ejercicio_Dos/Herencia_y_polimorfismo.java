package herencia_y_polimorfismo;

public class Herencia_y_polimorfismo {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        
        figuras[0] = new Circulo(3.0, "Circulo A");
        figuras[1] = new Rectangulo(3, 5, "Rectangulo A");
        figuras[2] = new Circulo(5.0, "Circulo B");
        
        for (Figura f : figuras) {
            System.out.println("Figura: " + f.getNombre() + "\nArea: " + f.calcularArea() + "\n");
            
        }
    }
    
}
