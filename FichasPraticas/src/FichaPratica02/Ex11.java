package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double saldo, movimento;

        // Ler saldo e movimento
        System.out.print("Introduza o saldo: ");
        saldo = input.nextDouble();

        System.out.print("Valor a movimentar: ");
        movimento = input.nextDouble();

        if (saldo + movimento >= 0) {
            // Movimento válido
            saldo = saldo + movimento;
            System.out.println("Transação efetuada");
        } else {
            System.out.println("Transação inválida. Saldo insuficiente!");
        }

        System.out.println("\nSaldo: " + saldo + " €");

    }
}
