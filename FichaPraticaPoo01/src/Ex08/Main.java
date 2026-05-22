package Ex08;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Hamburguer", 7.5);
        Produto produto2 = new Produto("Coca-Cola", 1.5);

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();

        System.out.println("_________________________________");

        produto1.adquirirStock(15);
        produto2.adquirirStock(50);

        System.out.println("_________________________________");

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();

        System.out.println("_________________________________");

        produto1.venderProduto(7);
        produto2.venderProduto(300);

        System.out.println("_________________________________");

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
    }
}
