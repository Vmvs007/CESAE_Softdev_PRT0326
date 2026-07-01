package views;

import controllers.ClienteController;
import tools.ConsoleColors;

import java.util.Scanner;

public class ClienteView {

    private ClienteController clienteController;

    public ClienteView() {
        this.clienteController = new ClienteController();
    }

    public void menuCliente(){

        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n-+-+-+-+-+-+-+-+- CLIENTE -+-+-+-+-+-+-+-+-");
            System.out.println("1. Consultar Produtos");
            System.out.println("2. Consultar Produtos p/ Categoria");
            System.out.println("3. Consultar Produto mais Barato & Caro");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao){

                case 1:
                    break;

                case 2:
                    break;

                case 3:
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

        }while(opcao!=0);


    }
}
