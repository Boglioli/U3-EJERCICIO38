import java.util.ArrayList;

public class ArticuloIndexado extends PublicacionAcademica {
    private String factorImpacto;
    private String cuartil;

    public ArticuloIndexado(String titulo, String fechaPublicacion, ArrayList<String> autores, String factorImpacto, String cuartil) {
        super(titulo, fechaPublicacion, autores);
        this.factorImpacto = factorImpacto;
        this.cuartil = cuartil;
    }

    @Override
    public boolean validarIndexacion() {
        try {
            return Double.parseDouble(factorImpacto) > 0 && cuartil != null && !cuartil.trim().isEmpty();
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String generarPublicacion() {
        return titulo + " - " + factorImpacto + " - " + cuartil;
    }
}
