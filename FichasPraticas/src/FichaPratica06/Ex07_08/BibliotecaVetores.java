package FichaPratica06.Ex07_08;

import java.util.Scanner;

public class BibliotecaVetores {

    /**
     * Função que encontra o <b>maior</b> elemento do vetor
     * @param vetor Vetor a ser analisado
     * @return Maior elemento
     */
    public static int maiorElemento(int[] vetor) {

        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    /**
     * Função que encontra o <b>menor</b> elemento do vetor
     * @param vetor Vetor a ser analisado
     * @return Menor elemento
     */
    public static int menorElemento(int[] vetor) {

        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    /**
     * Função que calcula o <b>somatório</b> do vetor (soma de todos os seus elementos)
     * @param vetor Vetor a ser analisado
     * @return Somatório do vetor
     */
    public static int somatorio(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }

        return soma;
    }

    /**
     * Função que calcula a <b>média</b> do vetor
     * @param vetor Vetor a ser analisado
     * @return Média do vetor
     */
    public static int media(int[] vetor) {
        int media;

        media = somatorio(vetor) / vetor.length;

        return media;
    }

    /**
     * Função que analisa o vetor e retorna se é <b>crescente</b> ou não
     * @param vetor Vetor a ser analisado
     * @return true se crescente || false se não crescente
     */
    public static boolean crescente(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Função que analisa o vetor e retorna se um número específico existe
     * @param vetor Vetor a ser analisado
     * @param numProcurar Número que queremos encontrar no vetor
     * @return true se encontrou || false se não encontrou
     */
    public static boolean existeValor(int[] vetor, int numProcurar) {

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numProcurar) {
                return true;
            }
        }

        return false;
    }

    /**
     * Função que calcula a <b>quantidade de números pares</b> do vetor
     * @param vetor Vetor a ser analisado
     * @return Quantidade de pares
     */
    public static int contarPares(int[] vetor) {

        int contagemPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contagemPares++;
            }
        }

        return contagemPares;
    }

    /**
     * Função que soma os elementos de dois vetores, para um vetor final
     * @param v1 1º vetor a somar
     * @param v2 2º vetor a somar
     * @return Vetor que, em cada posição, tem a soma dos elementos dos outros vetores
     */
    public static int[] somarVetores(int[] v1, int[] v2) {

        int[] vetorSoma = new int[v1.length];

        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = v1[i] + v2[i];
        }

        return vetorSoma;

    }

    /**
     * Função que preenche um vetor com valores do utilizador (input)
     * @param tamanho Tamanho desejado para o vetor
     * @return Vetor preenchido
     */
    public static int[] preencherVetor(int tamanho) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira um número no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }

}
