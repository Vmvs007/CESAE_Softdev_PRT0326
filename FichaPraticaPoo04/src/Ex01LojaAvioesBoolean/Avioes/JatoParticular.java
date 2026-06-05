package Ex01LojaAvioesBoolean.Avioes;

import Ex01LojaAvioesBoolean.Enums.CategoriaJato;
import Ex01LojaAvioesBoolean.Enums.Instalacao;

import java.util.ArrayList;

public class JatoParticular extends Aviao {

    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> instalacoes;

    public JatoParticular(int serial, String modelo, int anoFabrico, double peso, double cmpFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(serial, modelo, anoFabrico, peso, cmpFuselagem, envAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacao>();
    }

    public int getLotacao() {
        return lotacao;
    }

    public double getCapacidadeBagagem() {
        return capacidadeBagagem;
    }

    public CategoriaJato getCategoria() {
        return categoria;
    }

    public void adicionarInstalacao(Instalacao instalacaoNova) {
        this.instalacoes.add(instalacaoNova);
    }

    public void removerInstalacao(Instalacao instalacaoRemover) {
        this.instalacoes.remove(instalacaoRemover);
    }

    public void demonstracaoVooSereno() {
        System.out.println("O avião passa com a maior das serenidades. Com muita qualidade!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Lotação: " + this.lotacao + " | Cap. Bagagem: " + this.capacidadeBagagem + " cm3 | Categoria: " + this.categoria);
        System.out.println("Instalações: " + this.instalacoes);
    }
}
