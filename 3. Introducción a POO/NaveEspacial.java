package introduccion_poo;

public class NaveEspacial {
    String nombre;
    int combustible;
    boolean avanzar;
    
    void despegar(){
        if (combustible >= 60 && combustible <= 100){
            System.out.println("Despegando!");
            avanzar = true;
            avanzar(100);
        }else if (combustible > 100){
            System.out.println("Se ha superado el limite de recarga de combustible!");
            avanzar = false;
        }else {
            System.out.println("Se requiere de recarga de combustible!");
            avanzar = false;
        }
    }
    
    void avanzar(int distancia){
        if (avanzar == true){
            System.out.println("Hemos avanzando " + distancia + "km!");
        }else{
            System.out.println("Aun no podemos avanzar, requerimos combustible");
        }
    }
    
    int recargarCombustible(int cantidad){
        return combustible += cantidad;
    }
    
    void mostrarEstado(){
            System.out.println("La nave: " + nombre + " ha despegado con " + combustible + " de combustible.");
}
}
