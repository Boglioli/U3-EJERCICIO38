import java.util.ArrayList;
import java.util.List;
public class PublicacionAcademica {
    protected String titulo;
    protected String fechaPublicacion;
    protected ArrayList<String> autores;
    public PublicacionAcademica(String titulo, String fechaPublicacion, ArrayList<String> autores) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autores = autores;
    }
    public boolean validarIndexacion() {
        return false;
    }
    public String generarPublicacion() {
        return titulo + ". " + fechaPublicacion;
    }
}
