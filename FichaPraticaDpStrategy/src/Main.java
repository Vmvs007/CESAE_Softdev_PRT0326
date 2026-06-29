import EstrategiasRota.EstrategiaRotaNaval;
import EstrategiasRota.EstrategiaRotaPedestre;
import EstrategiasRota.EstrategiaRotaRodoviaria;

public class Main {
    public static void main(String[] args) {

        Navegador mapa = new Navegador("vitor", "vitor@mail.pt", "PT", new EstrategiaRotaRodoviaria());
        mapa.mostrarRota("Porto","Vila do Conde");
        mapa.mostrarRota("Braga","Ponte de Lima");

        mapa.setEstrategiaAtual(new EstrategiaRotaPedestre());

        mapa.mostrarRota("Matosinhos","Leça da Palmeira");

        mapa.setEstrategiaAtual(new EstrategiaRotaNaval());

        mapa.mostrarRota("Matosinhos","Leça da Palmeira");
    }
}
