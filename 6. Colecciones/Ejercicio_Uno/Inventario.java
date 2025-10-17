
package coleccciones;

import java.util.ArrayList;

public class Inventario {
   private ArrayList<Producto> productos = new ArrayList<>();
   
   
   
   public void agregarProducto(Producto p){
       productos.add(p);
   }

   public void listarProductos(){
       for (Producto p : productos) {
           System.out.println(p.getId() + " - " + p.getNombre());
       }
   }
   
   public Producto buscarProductoPorId(String id){
       for (Producto p : productos){
           if (p.getId().equals(id)){
               return p;
           }
       } return null;
   } 
   
   public boolean eliminarProducto(String id){
       Producto encontrado = buscarProductoPorId(id);
       if (encontrado != null){
           productos.remove(encontrado);
           return true;
        } return false;
   }
   
   public boolean actualizarStock(String id, int nuevaCantidad){
       Producto p = buscarProductoPorId(id);
       if (p != null){
           p.setCantidad(nuevaCantidad);
           return true;
       } return false;
   }
   
   public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
       ArrayList <Producto> filtrados = new ArrayList<>();
       for (Producto p : productos) {
           if (p.getCategoria() == categoria){
               filtrados.add(p);
           }
       } return filtrados;
   }
   
   public int obtenerTotalStock(){
       int total = 0;
       for (Producto p : productos) {
           total += p.getCantidad();
       } return total;
   }
   
   public Producto obtenerProductoConMayorStock(){
       if (productos.isEmpty()) return null;
       Producto mayor = productos.get(0);
       for (Producto p : productos) {
           if (p.getCantidad() > mayor.getCantidad()){
               mayor = p;
           } 
       } return mayor;
   }
   
   public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
    ArrayList<Producto> filtrados = new ArrayList<>();
    for (Producto p : productos) {
        if (p.getPrecio() >= min && p.getPrecio() <= max) {
            filtrados.add(p);
        }
    }
    return filtrados;
}

   public void mostrarCategoriasDisponibles() {
    for (CategoriaProducto c : CategoriaProducto.values()) {
        System.out.println("Categoria: " + c + "\nDescripcion: " + c.getDescripcion());
    }
}

   public Producto mostrarProductoPorId(String id){
       for (Producto p : productos) {
           if (p.getId().equals(id)){
               System.out.println("ID: " + p.getId() + "\nNombre: " + p.getNombre() + "\nPrecio: " + p.getPrecio() + "\nCantidad: " + p.getCantidad() + "\nCategoria: " + p.getCategoria());
           }
       } return null;
   }
}



