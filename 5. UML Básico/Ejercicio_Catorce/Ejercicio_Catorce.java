package ejercicio_catorce;

public class Ejercicio_Catorce {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Promo", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
}
