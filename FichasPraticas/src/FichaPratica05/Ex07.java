package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[] vetor = new int[5];

        // Leitura do vetor
        System.out.println("----- Leitura do Vetor -----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no armario[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int maiorPar = -1;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {

                if (maiorPar % 2 != 0) {
                    maiorPar = vetor[i];
                }

                if (vetor[i] > maiorPar) {
                    maiorPar = vetor[i];
                }

            }
        }

        if (maiorPar % 2 == 0) {
            System.out.println("Maior par: " + maiorPar);
        } else {
            System.out.println("Não há pares");
        }


    }
}
