package ex03;

class Autocarro extends Transporte{
    private Transporte sucessor = null;

    @Override
    public void viajar(TipoDeViagem tipo) {
        if (consegueTratar(tipo, TipoDeViagem.REGIONAL))
            System. out.println("A viagem será feita de Autocarro");
        else
            super.viajar(tipo);
    }


}