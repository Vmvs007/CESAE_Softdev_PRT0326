package Ex01LojaAvioesBoolean;

import Ex01LojaAvioesBoolean.Avioes.Aviao;
import Ex01LojaAvioesBoolean.Avioes.AviaoCombate;
import Ex01LojaAvioesBoolean.Avioes.JatoParticular;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> catalogoStock;

    public Catalogo() {
        this.catalogoStock = new ArrayList<Aviao>();
    }

    public void adquirirAviao(Aviao aviaoNovo) {
        this.catalogoStock.add(aviaoNovo);
    }

    public void venderAviao(Aviao aviaovendido) {
        this.catalogoStock.remove(aviaovendido);
    }

    public void exibirCatalogo(){
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+- CATÁLOGO BOOLEAN 747 -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");

        for (Aviao aviaoAtual : this.catalogoStock){
            aviaoAtual.exibirDetalhes();

            if(aviaoAtual instanceof JatoParticular){
                JatoParticular jatoParticularAtual = (JatoParticular) aviaoAtual;
                jatoParticularAtual.demonstracaoVooSereno();
            }

            if(aviaoAtual instanceof AviaoCombate){
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.demonstracaoArsenal();
            }

            System.out.println();
        }
    }
}
