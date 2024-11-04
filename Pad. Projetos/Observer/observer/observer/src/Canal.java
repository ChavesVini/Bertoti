import java.util.ArrayList;
import java.util.List;

public class Canal {
    private List<Inscrito> inscritos = new ArrayList<>();

    public void inscrever(Inscrito inscrito) {
        inscritos.add(inscrito);
    }

    public void desinscrever(Inscrito inscrito) {
        inscritos.remove(inscrito);
    }

    public void notificar(String mensagem) {
        for (Inscrito inscrito : inscritos) {
            inscrito.atualizar(mensagem);
        }
    }
}
