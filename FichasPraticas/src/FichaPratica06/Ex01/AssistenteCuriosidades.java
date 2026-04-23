package FichaPratica06.Ex01;

import java.util.Scanner;

import static FichaPratica06.Ex01.BibliotecaConsolaBonita.copyright;
import static FichaPratica06.Ex01.BibliotecaConsolaBonita.primaEnterParaContinuar;
import static FichaPratica06.Ex01.BibliotecaCuriosidades.*;


public class AssistenteCuriosidades {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {


            System.out.println("\n\n\n----- Assistente de Curiosidades -----");
            System.out.println("1. Maior Idade");
            System.out.println("2. Fase Vida");
            System.out.println("3. Geogragia - Países/Capitais");
            System.out.println("4. Estações do Ano");
            System.out.println("5. Dias da Semana");
            System.out.println("6. Tipos de Número");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("-----------------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("Maior Idade");

                    int idade01;

                    System.out.print("Insira a idade: ");
                    idade01 = input.nextInt();

                    if (maiorDeIdade(idade01)) {
                        System.out.println("Maior de idade");
                    } else {
                        System.out.println("Menor de idade");
                    }

                    break;

                case 2:
                    System.out.println("Fase Vida");

                    int idade02;

                    System.out.print("Insira a idade: ");
                    idade02 = input.nextInt();

                    System.out.println("Essa pessoa é: " + faseVida(idade02));
                    break;

                case 3:
                    System.out.println("Geogragia - Países/Capitais");

                    String paisInput;

                    System.out.print("Insira o país: ");
                    paisInput = input.next();

                    System.out.println("Capital: " + capitalPais(paisInput));

                    break;

                case 4:
                    System.out.println("Estações do Ano");
                    break;

                case 5:
                    System.out.println("Dias da Semana");
                    break;

                case 6:
                    System.out.println("Tipos de Número");
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
