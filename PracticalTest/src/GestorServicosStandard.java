import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class GestorServicosStandard implements GestorServicos {
    private Map<Integer, Servico> servicoMap = new HashMap<>();

    @Override
    public Iterator<String> iterator() {
        return (this).new ServicosIterator<String>();
    }

    public Map<Integer, Servico> getServicoMap() {
        return servicoMap;
    }

    @Override
    public boolean registaServico(String id, Servico servico) {
        Integer id_int = Integer.valueOf(id);
        this.servicoMap.putIfAbsent(id_int, servico);
        if (this.servicoMap.containsKey(id_int)) {
            this.servicoMap.put(id_int, servico);
        }
        return true;
    }

    @Override
    public boolean existeServico(String id) {
        if (this.servicoMap.containsKey(Integer.valueOf(id))) {
            return true;
        }
        return false;
    }

    @Override
    public Servico eliminaServico(String id) {
        if (existeServico(id)) {
            return this.servicoMap.remove(Integer.valueOf(id));
        }
        return null;
    }

    @Override
    public Servico getServico(String id) {
        if (existeServico(id)) {
            return this.servicoMap.get(Integer.valueOf(id));
        }
        return null;
    }

    private class ServicosIterator<String> implements Iterator<String> {
        private int indice;

        ServicosIterator() {
            indice = 0;
        }

        public boolean hasNext() {
            return (indice < servicoMap.size());
        }

        public String next() {
            if (hasNext()) {
                return (String) ("Ref: " + servicoMap.keySet().toArray()[indice] + " - " + servicoMap.get(servicoMap.keySet().toArray()[indice++]));
            }
            throw new NoSuchElementException("only " + servicoMap.size() + " elements");
        }
    }
}
