package Ex01;

public class Cosmetica extends Produto{

    public Cosmetica(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("💨 Cosmética | " + this.descricao + " | " + this.preco + " €");
    }
}
