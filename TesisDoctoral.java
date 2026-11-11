import java.util.ArrayList;

public class TesisDoctoral extends PublicacionAcademica {
    private String nombreDirector;
    private String universidadOtorgante;

    public TesisDoctoral(String titulo, String fechaPublicacion, ArrayList<String> autores, String nombreDirector, String universidadOtorgante) {
        super(titulo, fechaPublicacion, autores);
        this.nombreDirector = nombreDirector;
        this.universidadOtorgante = universidadOtorgante;
    }

    @Override
    public boolean validarIndexacion() {
        return nombreDirector != null && !nombreDirector.trim().isEmpty()
                && universidadOtorgante != null && !universidadOtorgante.trim().isEmpty();
    }

    @Override
    public String generarPublicacion() {
        return titulo + " - " + nombreDirector + " - " + universidadOtorgante;
    }
}
