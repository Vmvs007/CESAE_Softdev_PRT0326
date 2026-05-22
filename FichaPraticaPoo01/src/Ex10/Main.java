package Ex10;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("PT50 0033 0000 1111", "Quim");
        ContaBancaria conta2 = new ContaBancaria("PT50 0033 0000 3333", "Zé");

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        System.out.println("__________________________________");

        conta1.depositar(50);
        conta2.depositar(1000);

        System.out.println("__________________________________");

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        System.out.println("__________________________________");

//        conta1.levantar(15);
//        conta2.levantar(3500);
        conta1.transferir(conta2, 20);


        System.out.println("__________________________________");

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
    }
}
