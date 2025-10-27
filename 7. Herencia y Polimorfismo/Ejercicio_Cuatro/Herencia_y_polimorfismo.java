package herencia_y_polimorfismo;

public class Herencia_y_polimorfismo {

    public static void main(String[] args) {
        Animal[] animales = new Animal[5];
        
        animales[0] = new Perro("Negro", 5, "Perro A");
        animales[1] = new Vaca(3, "Vaca A");
        animales[2] = new Gato("Naranja", 2, "Gato A");
        animales[3] = new Perro("Blanco", 7, "Perro B");
        animales[4] = new Vaca(10, "Vaca B");
        
        for (Animal a : animales) {
            a.hacerSonido();
            a.describirAnimal();
            System.out.println("");
        }
    }  
        
}
    
