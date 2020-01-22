public class TV implements Servico {
    private String nome;
    private String descricao;
    private double custo;
    private int nOfCanais;

    public TV(String nome, String descricao, double custo, int canais) {
        this.nome = nome;
        this.descricao = descricao;
        this.custo = custo;
        this.nOfCanais = canais;
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

    @Override
    public String toString() {
        return "TV [" +
                "nome=" + nome +
                ", descricao=" + descricao +
                ", custo=" + custo +
                "], nOfCanais=" + nOfCanais;
    }

    public int nOfCanais() {
        return this.nOfCanais;
    }
}
