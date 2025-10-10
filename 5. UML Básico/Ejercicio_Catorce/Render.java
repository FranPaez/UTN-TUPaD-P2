package ejercicio_catorce;

public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render en formato: " + formato + " | Proyecto: " + proyecto;
    }
}
