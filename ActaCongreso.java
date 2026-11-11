import java.util.ArrayList;

public class ActaCongreso extends PublicacionAcademica {
    private String nombreSimposio;
    private String ciudadSede;

    public ActaCongreso(String titulo, String fechaPublicacion, ArrayList<String> autores, String nombreSimposio, String ciudadSede) {
        super(titulo, fechaPublicacion, autores);
        this.nombreSimposio = nombreSimposio;
        this.ciudadSede = ciudadSede;
    }

    @Override
    public boolean validarIndexacion() {
        return nombreSimposio != null && !nombreSimposio.trim().isEmpty()
                && ciudadSede != null && !ciudadSede.trim().isEmpty();
    }

    @Override
    public String generarPublicacion() {
        return titulo + " - " + nombreSimposio + " - " + ciudadSede;
    }
}

