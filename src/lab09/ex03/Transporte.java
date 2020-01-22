package ex03;

abstract class Transporte {
    private Transporte sucessor = null;

    public void viajar(TipoDeViagem tipo) {
        if (sucessor != null)
            sucessor.viajar(tipo);
        else
            System. out.println("Não existem transportes disponiveis para o tipo de viagem: " + tipo);
    }

    protected boolean consegueTratar(TipoDeViagem tipo,TipoDeViagem permitido) {
        return (tipo == null) || (tipo == permitido);
    }

    public Transporte escolherSucessor(Transporte sucessor) {
        this.sucessor = sucessor;
        return this;
    }
}