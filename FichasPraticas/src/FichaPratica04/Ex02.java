package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int opcao;

        // MENU
        do {

            // Apresentar as opções
            System.out.println("\n\n_____ MENU _____");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            // Ler a opção
            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n_____ CRIAR _____");

                    System.out.print("Insira o nome: ");
                    String nome = input.next();

                    System.out.print("Insira o codigo postal: ");
                    String codPostal = input.next();

                    break;

                case 2:
                    System.out.println("\n_____ ATUALIZAR _____");
                    break;

                case 3:
                    System.out.println("\n_____ ELIMINAR _____");
                    break;

                case 4:
                    System.out.println("\nA encerrar o programa...");
                    break;

                default:
                    System.out.println("Opção não reconhecida: " + opcao);
                    break;
            }

        } while (opcao != 4);

    }
}
