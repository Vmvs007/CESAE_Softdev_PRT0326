package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int quantidadeNumeros, contador = 1, numeroAnterior, numeroAtual;
        boolean crescente = true;

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
                crescente = false;
            }

            numeroAnterior = numeroAtual;
            contador++;
        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }
    }
}
