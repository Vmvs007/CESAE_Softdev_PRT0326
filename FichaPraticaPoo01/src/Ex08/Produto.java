package Ex08;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeStock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeStock() {
        return quantidadeStock;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adquirirStock(int quantidadeAdquirida) {
        this.quantidadeStock += quantidadeAdquirida;
        System.out.println("Stock adquirido para o produto " + this.nome + ": " + quantidadeAdquirida);
    }

    public void venderProduto(int quantidadeVendida) {

        if (this.quantidadeStock >= quantidadeVendida) {
            // venda com sucesso
            this.quantidadeStock -= quantidadeVendida;

            double valorVenda = quantidadeVendida * this.preco;
            System.out.println("Venda para o produto " + this.nome + ": " + quantidadeVendida + " | Total: " + valorVenda);
        } else {
            // venda recusada
            System.out.println("Venda de " + this.nome + " recusada por ruptura de stock.");
        }


    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | Preço: " + this.preco + " € | Stock: " + this.quantidadeStock);
    }

}
