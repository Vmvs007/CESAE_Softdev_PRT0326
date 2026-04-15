package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[] vetor = new int[5];
        int menorElemento;

        // Leitura do vetor
        System.out.println("----- Leitura do Vetor -----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no armario[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // Encontrar o maior elemento
        menorElemento = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
            }
        }

        System.out.println("Menor: " + menorElemento);
    }
}
