package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.BibliotecaNumeros.*;

public class Ex00 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n\n\n----- Canivete Suiço da Programação -----");
            System.out.println("1. Converter Moedas");
            System.out.println("2. Elevar um número ao quadrado");
            System.out.println("3. Saber se um número é primo");
            System.out.println("4. Imprimir os números pares entre 2 e 400");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            System.out.println("-----------------------------------------------");

            switch (opcao) {
                case 1: // Converter Moedas
                    System.out.println("----- Converter Moedas -----");

                    double valor, conversao;
                    String moeda;

                    System.out.print("Valor: ");
                    valor = input.nextDouble();

                    System.out.print("Moeda (ex: USD BRL GBP YEN): ");
                    moeda = input.next();

                    conversao = converterMoedas(valor,moeda);
                    System.out.println("Valor convertido em " + moeda + ": " + conversao);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 0:
                    System.out.println("A encerrar o programa...");
                    break;

                default:
                    System.out.println("Opção não reconhecida: " + opcao);
            }


        } while (opcao != 0);

    }
}
