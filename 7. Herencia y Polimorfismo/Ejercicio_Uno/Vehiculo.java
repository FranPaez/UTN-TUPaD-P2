package herencia_y_polimorfismo;

public class Vehiculo {
    private String marca;
    private String modelo;
    
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    
}
