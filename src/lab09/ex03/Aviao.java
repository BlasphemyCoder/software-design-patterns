package ex03;

class Aviao extends Transporte{
    private Transporte sucessor = null;

    @Override
    public void viajar(TipoDeViagem tipo) {
        if (consegueTratar(tipo, TipoDeViagem.INTERNACIONAL))
            System. out.println("A viagem será feita de Aviao");
        else
            super.viajar(tipo);
    }


}