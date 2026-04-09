package FichaPratica03;

import java.util.Scanner;

public class Ex14_v2 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int quantidadeNumeros, contador = 1, numeroAnterior, numeroAtual;
        int crescente = 0;

        // Ler quantidade
        System.out.print("Quantos números deseja inserir: ");
        quantidadeNumeros = input.nextInt();

        System.out.print("Insira um número: ");
        numeroAnterior = input.nextInt();

        while (contador < quantidadeNumeros) {
            System.out.print("Insira um número: ");
            numeroAtual = input.nextInt();

            if (numeroAtual <= numeroAnterior) {
                // Sequencia deixa de ser crescente
                crescente=1;
            }

            numeroAnterior = numeroAtual;
            contador++;
        }

        if (crescente == 0) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }
    }
}
