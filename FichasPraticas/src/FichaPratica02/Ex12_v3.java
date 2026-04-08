package FichaPratica02;

import java.util.Scanner;

public class Ex12_v3 {
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
        } else if (opcao == 2) {
            System.out.println("\nAtualizar");
        } else if (opcao == 3) {
            System.out.println("\nEliminar");
        } else if (opcao == 4) {

        } else {
            System.out.println("\nOpção inválida!");
        }

    }
}
