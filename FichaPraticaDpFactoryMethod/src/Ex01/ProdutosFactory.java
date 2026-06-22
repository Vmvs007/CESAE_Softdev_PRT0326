package Ex01;

public class ProdutosFactory {

    public static Produto criarProduto(String tipoProduto, String descricao, double preco) {

        switch (tipoProduto.toLowerCase()) {

            case "alimentacao":
                return new Alimentacao(descricao, preco);

            case "eletronico":
                return new Eletronico(descricao, preco);

            case "roupa":
                return new Roupa(descricao, preco);

            case "cosmetica":
                return new Cosmetica(descricao, preco);

            default:
                throw new IllegalArgumentException("Tipo de Produto inválido: " + tipoProduto);

        }

    }

}
