package ex03;
import java.util.ArrayList;

public class AgenciaDeViagens {
    public static void main(String[] args) {
        ArrayList<TipoDeViagem> listaDeViagens = new ArrayList<>();
        listaDeViagens.add(TipoDeViagem.NACIONAL);
        listaDeViagens.add(TipoDeViagem.REGIONAL);
        listaDeViagens.add(TipoDeViagem.INTERNACIONAL);
        listaDeViagens.add(TipoDeViagem.INTERCONTINENTAL);
        listaDeViagens.add(TipoDeViagem.MARITIMA);

        Transporte transporteChain =
            new Aviao().escolherSucessor(
                new Autocarro().escolherSucessor(
                    new Comboio()));
        for (TipoDeViagem tipo : listaDeViagens) {
            transporteChain.viajar(tipo);
        }
    }
}