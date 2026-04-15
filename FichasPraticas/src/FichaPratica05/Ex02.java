package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double[] comissoes = new double[12];
        double somaComissoes = 0;

        // Leitura do vetor
        System.out.println("----- Leitura das Comissões -----");

        for (int i = 0; i < comissoes.length; i++) {
            System.out.print("Insira as comissões[" + i + "]: ");
            comissoes[i] = input.nextDouble();
        }

        // Calcular a soma dos elementos
        for (int i = 0; i < comissoes.length; i++) {
            somaComissoes = somaComissoes + comissoes[i];
        }

        System.out.println("Total de Comissões Anual: " + somaComissoes + " €");

    }
}
