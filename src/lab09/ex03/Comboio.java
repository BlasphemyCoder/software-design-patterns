package ex03;

class Comboio extends Transporte{
    private Transporte sucessor = null;

    @Override
    public void viajar(TipoDeViagem tipo) {
        if (consegueTratar(tipo, TipoDeViagem.NACIONAL))
            System. out.println("A viagem será feita de Comboio");
        else
            super.viajar(tipo);
    }


}