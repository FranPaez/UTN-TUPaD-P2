package coleccciones;


public class Autor {
   private String id;
   private String nombre;
   private String nacionalidad;
   
   public void mostrarInfo(){
       System.out.println("ID: " + id + "\nNombre: " + nombre + "\nNacionalidad: " + nacionalidad);
   }

    public String getNombre() {
        return nombre;
    }

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nNacionalidad: " + nacionalidad + "\n";
    }

   
   
}



