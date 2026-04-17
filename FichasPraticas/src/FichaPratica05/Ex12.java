package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[] vetor01 = new int[10];
        int[] vetor02 = new int[10];

        // Leitura do vetor 01
        System.out.println("----- Leitura do Vetor 01 -----");

        for (int i = 0; i < vetor01.length; i++) {
            System.out.print("Insira um número no vetor01[" + i + "]: ");
            vetor01[i] = input.nextInt();
        }

        // Leitura do vetor 02
        System.out.println("\n----- Leitura do Vetor 02 -----");

        for (int i = 0; i < vetor02.length; i++) {
            System.out.print("Insira um número no vetor02[" + i + "]: ");
            vetor02[i] = input.nextInt();
        }

        // Passar os vetores para a matriz
        int[][] matriz = new int[10][2];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = vetor01[i];
            matriz[i][1] = vetor02[i];
        }


        // Impressão da matriz
        System.out.println("\n----- Impressão da Matriz -----");

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }


    }
}
