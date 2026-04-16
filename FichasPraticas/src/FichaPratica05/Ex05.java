package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[] vetor = new int[10];
        int soma = 0, media;

        // Leitura do vetor
        System.out.println("----- Leitura do Vetor -----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no armario[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Calcular a soma dos elementos
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }

        // Média = soma dos elementos / quantidade de elementos
        media = soma / vetor.length;

        System.out.println("\nMédia: "+media);
    }
}
