package herencia_y_polimorfismo;

public class Gato extends Animal{

    private String color;
    private int edad;

    public Gato(String color, int edad, String especie) {
        super(especie);
        this.color = color;
        this.edad = edad;
    }

    
    @Override
    public void hacerSonido(){
        System.out.println("Maullando...");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("Especie: " + getEspecie() + "\nColor: " + color + "\nEdad: " + edad);
    }
}
