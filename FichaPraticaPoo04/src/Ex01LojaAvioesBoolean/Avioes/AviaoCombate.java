package Ex01LojaAvioesBoolean.Avioes;

import Ex01LojaAvioesBoolean.Enums.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(int serial, String modelo, int anoFabrico, double peso, double cmpFuselagem, double envAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(serial, modelo, anoFabrico, peso, cmpFuselagem, envAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public boolean isCamuflagem() {
        return camuflagem;
    }


    public void adicionarArma(Arma armaNova) {
        if (this.arsenal.size() < 3) {
            this.arsenal.add(armaNova);
        }
    }

    public void removerArma(Arma armaRemover) {
        this.arsenal.remove(armaRemover);
    }

    public void demonstracaoArsenal() {
        System.out.println("O avião passa com muita velocidade! ZUMMMMMMMMMMMMMMMMMMMMMMMMMM");
        System.out.println(this.arsenal + " foram todas ativadas");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(this.paisOrigem + " | Tem camuflagem: " + this.camuflagem);
        System.out.println("Arsenal: " + this.arsenal);
    }
}
