package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int numeroSecreto, palpite, contadorPalpites = 0;

        System.out.print("JOGADOR 1 - Insira o número secreto ( 0 - 100 ): ");
        numeroSecreto = input.nextInt();

        do {
            System.out.print("\nJOGADOR 2 - Tente adivinhar: ");
            palpite = input.nextInt();
            contadorPalpites++;

            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é mais baixo...");
            }

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é mais alto...");
            }

        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Acertaste no número secreto: " + numeroSecreto);
        System.out.println("Foram precisas " + contadorPalpites + " tentativas.");
    }
}
