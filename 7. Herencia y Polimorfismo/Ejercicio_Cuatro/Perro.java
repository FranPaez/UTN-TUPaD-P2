package herencia_y_polimorfismo;

public class Perro extends Animal{

    private String color;
    private int edad;

    public Perro(String color, int edad, String especie) {
        super(especie);
        this.color = color;
        this.edad = edad;
    }

    @Override
    public void hacerSonido(){
        System.out.println("Ladrando...");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("Especie: " + getEspecie() + "\nColor: " + color + "\nEdad: " + edad);
    }
    
}
