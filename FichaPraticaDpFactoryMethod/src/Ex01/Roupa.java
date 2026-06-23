package Ex01;

public class Roupa extends Produto {


    public Roupa(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("👚 Roupa | " + this.descricao + " | " + this.preco + " €");
    }


}
