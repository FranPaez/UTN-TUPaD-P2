package introduccion_poo;

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
    System.out.println("Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad);
}
    int cumplirAnios(int aniosCumplidos){
        edad = edad += aniosCumplidos;
        return edad;

    }
}
