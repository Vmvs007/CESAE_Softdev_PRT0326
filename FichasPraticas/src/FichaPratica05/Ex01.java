package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[] armario = new int[10];

        // Leitura do vetor
        System.out.println("----- Leitura do Armário -----");

        for (int i = 0; i < armario.length; i++) {
            System.out.print("Insira um número no armario[" + i + "]: ");
            armario[i] = input.nextInt();
        }


        // Impressao do vetor
        System.out.println("\n----- Impressão do Armário -----");

        for (int i = 0; i < armario.length; i++) {
            System.out.println("armario[" + i + "]: " + armario[i]);
        }

    }
}
