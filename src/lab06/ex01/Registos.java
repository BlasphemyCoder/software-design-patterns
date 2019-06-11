package lab06.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Registos {
    private ArrayList<Empregado> empregados; // Stores the employees

    public Registos() {
        empregados = new ArrayList<>();
    }

    public void insere(Empregado emp) {
        empregados.add(emp);
    }

    public void remove(int codigo) {
        empregados.removeIf(b->b.codigo() == codigo);
    }

    public boolean isEmpregado(int codigo) {
        Iterator it = empregados.iterator();

        while(it.hasNext()) {
            Empregado emp = (Empregado) it.next();

            if(emp.codigo() == codigo)
                return true;
        }

        return false;
    }

    public List<Empregado> listaDeEmpregados() {
        return this.empregados;
    }
}
