package FichaPratica02;

import java.util.Scanner;

public class Ex12_v2 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int opcao;

        // Apresentar opções
        System.out.println("__________ MENU __________");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.print("\nOpção: ");
        opcao = input.nextInt();

        if (opcao == 1) {
            System.out.println("\nCriar");
        }

        if (opcao == 2) {
            System.out.println("\nAtualizar");
        }

        if (opcao == 3) {
            System.out.println("\nEliminar");
        }

        if (opcao < 1 || opcao > 4) {
            System.out.println("\nOpção inválida!");
        }

    }
}
