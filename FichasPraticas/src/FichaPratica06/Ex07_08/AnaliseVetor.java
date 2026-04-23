package FichaPratica06.Ex07_08;

import java.util.Scanner;

import static FichaPratica06.Ex01_02.BibliotecaConsolaBonita.*;
import static FichaPratica06.Ex01_02.BibliotecaCuriosidades.*;
import static FichaPratica06.Ex07_08.BibliotecaVetores.*;

public class AnaliseVetor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao, tamanhoVetor;


        System.out.print("Tamanho do Vetor: ");
        tamanhoVetor = input.nextInt();

        int[] vetor = preencherVetor(tamanhoVetor);
        

        do {

            System.out.println("\n\n\n----- Análise de um Vetor -----");
            System.out.println("1. Maior");
            System.out.println("2. Menor");
            System.out.println("3. Somatório");
            System.out.println("4. Média");
            System.out.println("5. Crescente");
            System.out.println("6. Quantidade Pares");
            System.out.println("7. Pesquisar Valor");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("-----------------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("Maior: " + maiorElemento(vetor));
                    break;

                case 2:
                    System.out.println("Menor");

                    break;

                case 3:
                    System.out.println("Somatório");

                    break;

                case 4:
                    System.out.println("Média");
                    break;

                case 5:
                    System.out.println("Crescente");
                    break;

                case 6:
                    System.out.println("Quantidade Pares");
                    break;

                case 7:
                    System.out.println("Pesquisar Valor");
                    break;

                case 0:
                    System.out.println("A encerrar o programa...\n");
                    copyright();
                    break;

                default:
                    System.out.println("Opção não reconhecida: " + opcao);
            }

            primaEnterParaContinuar();

        } while (opcao != 0);

    }
}
