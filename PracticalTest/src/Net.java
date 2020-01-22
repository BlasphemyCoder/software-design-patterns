public class Net implements Servico {
    private String nome;
    private String descricao;
    private double custo;
    private String vel;

    public Net(String nome, String descricao, double custo, String vel) {
        this.nome = nome;
        this.descricao = descricao;
        this.custo = custo;
        this.vel = vel;
    }

    @Override
    public String toString() {
        return "Net [" +
                "nome=" + nome +
                ", descricao=" + descricao +
                ", custo=" + custo +
                "], vel=" + vel;
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
        return this.custo;
    }

    public String vel() {
        return this.vel;
    }
}
