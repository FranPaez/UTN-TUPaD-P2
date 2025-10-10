package ejercicio_cinco;

public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "Placa madre modelo: " + modelo + ", chipset: " + chipset;
    }
    
    
}
