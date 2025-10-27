package herencia_y_polimorfismo;

public class Vaca extends Animal{
    
    private int edad;

    public Vaca(int edad, String especie) {
        super(especie);
        this.edad = edad;
    }

    @Override
    public void hacerSonido(){
        System.out.println("Mugiendo...");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("Especie: " + getEspecie() + "\nEdad: " + edad);
    }
}
