package Ex01LojaAvioesBoolean;

import Ex01LojaAvioesBoolean.Avioes.AviaoCombate;
import Ex01LojaAvioesBoolean.Avioes.JatoParticular;
import Ex01LojaAvioesBoolean.Enums.Arma;
import Ex01LojaAvioesBoolean.Enums.CategoriaJato;
import Ex01LojaAvioesBoolean.Enums.Instalacao;

public class Main {
    public static void main(String[] args) {

        JatoParticular jatoParticularA = new JatoParticular(
                112233,
                "Gulfstream",
                2015,
                2500,
                7.5,
                5,
                1.2,
                2,
                1900,
                750,
                15000,
                12,
                1000,
                CategoriaJato.LIGHT_JET);
        jatoParticularA.adicionarInstalacao(Instalacao.WC);
        jatoParticularA.adicionarInstalacao(Instalacao.WIFI);
        jatoParticularA.adicionarInstalacao(Instalacao.ESCRITORIO);
        jatoParticularA.adicionarInstalacao(Instalacao.TOMADAS);

        JatoParticular jatoParticularB = new JatoParticular(222555777, "Boeing 737", 2010, 9000, 25, 12, 2.1, 4, 4500, 900, 23600, 120, 5000, CategoriaJato.HEAVY_JET);
        jatoParticularB.adicionarInstalacao(Instalacao.WC);
        jatoParticularB.adicionarInstalacao(Instalacao.WC);
        jatoParticularB.adicionarInstalacao(Instalacao.WIFI);
        jatoParticularB.adicionarInstalacao(Instalacao.PISCINA);

        AviaoCombate aviaoCombateA = new AviaoCombate(909, "F16", 1999, 900, 4, 2.3, 0.9, 1, 1100, 1200, 34900, "USA", false);
        aviaoCombateA.adicionarArma(Arma.METRALHADORA);
        aviaoCombateA.adicionarArma(Arma.FOGUETES);
        aviaoCombateA.adicionarArma(Arma.MISSEIS);

        AviaoCombate aviaoCombateB= new AviaoCombate(100, "F22", 2017, 920, 4.9, 2.4, 1.1, 2, 3500, 1600, 50000, "USA", true);
        aviaoCombateB.adicionarArma(Arma.BOMBAS);
        aviaoCombateB.adicionarArma(Arma.TORPEDOS);


        Catalogo avioesBoolean = new Catalogo();
        avioesBoolean.adquirirAviao(jatoParticularA);
        avioesBoolean.adquirirAviao(jatoParticularB);
        avioesBoolean.adquirirAviao(aviaoCombateA);
        avioesBoolean.adquirirAviao(aviaoCombateB);

        avioesBoolean.exibirCatalogo();
    }
}
