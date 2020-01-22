import java.util.ArrayList;
import java.util.List;

public class Pacote implements Servico {
    private String nome;
    private String descricao;
    private double custo = 0;
    private int fidelizacao;
    private List<Servico> servicos = new ArrayList<>();

    public Pacote(String nome, String descricao, int fidelizacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.fidelizacao = fidelizacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pacote [nome=" + nome + ", descricao=" + descricao + ", custo=" + custo() + "] com fidelização de " + this.fidelizacao + " meses");

        for (Servico s: this.servicos) {
            sb.append("\n                   ");
            sb.append(s.toString());
        }
        return sb.toString();
    }

    @Override
    public String nome() {
        return this.nome;
    }

    @Override
    public String descricao() {
        return this.descricao;
    }

    @Override
    public double custo() {
        return this.custo*(1-0.16);
    }

    public int fidelizacao() {
        return this.fidelizacao;
    }

    public void add(Servico servico) {
        this.servicos.add(servico);
        this.custo += servico.custo();
    }
}
