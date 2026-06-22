package Ex01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> stockLoja = new ArrayList<Produto>();
        stockLoja.add(ProdutosFactory.criarProduto("Alimentacao", "Banana", 1.5));
        stockLoja.add(ProdutosFactory.criarProduto("Alimentacao", "Hamburguer", 9.9));
        stockLoja.add(ProdutosFactory.criarProduto("Eletronico", "Computador HP", 990));
        stockLoja.add(ProdutosFactory.criarProduto("Roupa", "Vestido Amarelo", 50));
        stockLoja.add(ProdutosFactory.criarProduto("Alimentacao", "Maça", 0.9));
        stockLoja.add(ProdutosFactory.criarProduto("Cosmetica", "Perfume XPTO", 15));

        for (Produto produtoAtual : stockLoja) {
            produtoAtual.exibirDetalhes();
        }

    }
}
