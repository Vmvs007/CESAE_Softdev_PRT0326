package FichaPratica05;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[][] matriz = new int[4][4];

        // Leitura da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Impressão da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }

        // Calcular a soma da diagonal principal
        int somaDiagonal = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if(linha==coluna){
                    somaDiagonal = somaDiagonal + matriz[linha][coluna];
                }

            }
        }

    }
}
