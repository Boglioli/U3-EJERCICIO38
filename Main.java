import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> autoresArticulo = new ArrayList<>();
        autoresArticulo.add("Autor 1");
        autoresArticulo.add("Autor 2");
        ArticuloIndexado articulo = new ArticuloIndexado("Título del Artículo", "2023-01-01", autoresArticulo, "2.5", "Q1");

        ArrayList<String> autoresActa = new ArrayList<>();
        autoresActa.add("Autor A");
        ActaCongreso acta = new ActaCongreso("Título del Acta", "2023-02-01", autoresActa, "Nombre del Simposio", "Ciudad Sede");

        ArrayList<String> autoresTesis = new ArrayList<>();
        autoresTesis.add("Autor X");
        TesisDoctoral tesis = new TesisDoctoral("Título de la Tesis", "2023-03-01", autoresTesis, "Nombre del Director", "Universidad Otorgante");

        System.out.println(articulo.generarPublicacion());
        System.out.println(acta.generarPublicacion());
        System.out.println(tesis.generarPublicacion());
    }
}
