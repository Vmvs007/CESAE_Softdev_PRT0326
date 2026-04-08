package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
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
        opcao= input.nextInt();

        switch (opcao){
            case 1:
                System.out.println("\nCriar");
                break;

            case 2:
                System.out.println("\nAtualizar");
                break;

            case 3:
                System.out.println("\nEliminar");
                break;

            case 4:
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
