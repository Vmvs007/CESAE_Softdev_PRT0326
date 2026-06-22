package Ex01;

public class Eletronico extends Produto{

    public Eletronico(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("💻 Eletronico | " + this.descricao + " | " + this.preco + " €");
    }
}
