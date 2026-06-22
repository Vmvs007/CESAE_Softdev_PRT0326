package Ex01;

public class Alimentacao extends Produto {

    public Alimentacao(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("🍔 Alimento | " + this.descricao + " | " + this.preco + " €");
    }
}
