package introduccion_poo;

public class Gallina {
    String idGallina;
    int edad;
    int huevosPuestos;

    int ponerHuevo(int huevosNuevos){
        return huevosPuestos += huevosNuevos;
}
    int envejecer(int aniosCumplidos){
        return edad += aniosCumplidos;
    }
    
    void mostrarEstado(){
        System.out.println("ID Gallina: " + idGallina + ", Edad: " + edad + ", Huevos puestos: " + huevosPuestos);
    }
    
}
