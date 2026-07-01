package views;

import controllers.AdminController;
import tools.ConsoleColors;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {

    private AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void menuAdmin() {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-+-+-+-+-+-+-+-+- ADMINISTRADOR -+-+-+-+-+-+-+-+-");
            System.out.println("1. Produto mais vendido - quantidade");
            System.out.println("2. Produto mais vendido - valor");
            System.out.println("3. Melhor venda - unidades");
            System.out.println("4. Melhor venda - quantidade");
            System.out.println("5. Total vendas");
            System.out.println("6. Média Vendas");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Total Vendas: " + this.adminController.valorTotalVendas() + " €");
                    break;

                case 6:
                    System.out.println("Média Vendas: " + this.adminController.mediaVendas() + " €");

                    break;

                case 0:
                    ConsoleColors.clear();
                    System.out.println("Sair...");
                    break;

                default:
                    ConsoleColors.clear();
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (opcao != 0);


    }
}
