public class ServicoVazio implements Servico {
    @Override
    public String nome() {
        return null;
    }

    @Override
    public String descricao() {
        return null;
    }

    @Override
    public double custo() {
        return 0;
    }

    @Override
    public String toString() {
        return "ServicoVazio [" +
                "nome=nao existe" +
                ", descricao=nao existe" +
                ", custo=" + 0.0 +
                ']';
    }
}
