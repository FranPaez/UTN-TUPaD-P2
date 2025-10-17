package coleccciones;

public class Coleccciones {

    public static void main(String[] args) {
        
        // Iniciamos el inventario
        
        Inventario inventario = new Inventario();
        
        // Creamos los productos
        
        Producto p1 = new Producto("1", "Arroz", 1500.00, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Celular", 650000.00, 8, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("3", "Escoba", 15000.00, 3, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("4", "Mantel", 20000.00, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("5", "Remera", 5000.00, 5, CategoriaProducto.ROPA);
        
        // Agregamos los productos al inventario
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // Listamos el inventario
        
        System.out.println("Lista de productos: ");
        inventario.listarProductos();
        
        // Buscamos un producto por su ID
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Producto buscado por ID: ");
        System.out.println(inventario.buscarProductoPorId("3"));
        
        // Filtramos productos por categoria
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Producto filtrado por categoria: ");
        System.out.println(inventario.filtrarPorCategoria(CategoriaProducto.HOGAR));
        
        // Eliminamos un producto por su ID
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Producto eliminado: Mantel");
        inventario.eliminarProducto("4");
        inventario.listarProductos();
 
        
        // Actualizamos el stock de un producto
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Stock actual del producto: ");
        inventario.mostrarProductoPorId("5");
        System.out.println("");
        System.out.println("Stock actualizado del producto: ");
        inventario.actualizarStock("5", 10);
        inventario.mostrarProductoPorId("5");
        
        // Mostramos el stock total disponible
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Stock total disponible: ");
        System.out.println(inventario.obtenerTotalStock());
        
        // Mostramos el producto con mayor stock
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Producto con mayor stock: ");
        System.out.println(inventario.obtenerProductoConMayorStock());
        
        // Filtramos los productos con precio entre 1.000 y 10.000
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Productos con precio entre $1.000 y $10.000: ");
        System.out.println(inventario.filtrarProductosPorPrecio(1000.00, 10000.00));
        
        // Mostramos las categorias disponibles con su descripcion
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Categorias y descripcion: ");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
