package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {


        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[] vetor = new int[10];
        boolean crescrente = true;

        // Leitura do vetor
        System.out.println("----- Leitura do Vetor -----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no armario[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Avaliar se é crescente
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                crescrente = false;
            }
        }

        if (crescrente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }
    }
}
