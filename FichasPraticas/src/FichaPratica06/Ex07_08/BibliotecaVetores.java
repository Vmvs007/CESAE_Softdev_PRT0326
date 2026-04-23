package FichaPratica06.Ex07_08;

import java.util.Scanner;

public class BibliotecaVetores {

    public static int maiorElemento(int[] vetor) {

        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int[] somarVetores(int[] v1, int[] v2) {

        int[] vetorSoma = new int[v1.length];

        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = v1[i] + v2[i];
        }

        return vetorSoma;

    }


    public static int[] preencherVetor(int tamanho){
        Scanner input = new Scanner(System.in);


        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }

}
