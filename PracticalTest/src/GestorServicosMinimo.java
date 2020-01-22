import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestorServicosMinimo extends GestorServicosStandard implements GestorServicos {
    private GestorServicos gest;

    public GestorServicosMinimo(GestorServicos gest1) {
        this.gest = gest1;
    }

    @Override
    public boolean registaServico(String id, Servico servico) {
        if (super.getServicoMap().containsKey(id)) {
            return true;
        }
        return false;
    }

    @Override
    public Servico eliminaServico(String id) {
        return new ServicoVazio();
    }

    @Override
    public Iterator<String> iterator() {
        return gest.iterator();
    }
}
