package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[][] matriz = new int[3][5];

        // Leitura da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
            System.out.println();
        }

        // Perguntar o número a pesquisar
        int numPesquisa, contadorOcorrencias = 0;

        System.out.print("Número que quer pesquisar: ");
        numPesquisa = input.nextInt();

        // Contar quantas vezes é que o numPesquisa aparece na matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (matriz[linha][coluna] == numPesquisa) {
                    contadorOcorrencias++;
                }
            }
        }

        System.out.println("O número " + numPesquisa + " aparece " + contadorOcorrencias + " vezes na matriz");

    }
}
