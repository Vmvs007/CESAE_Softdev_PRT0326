package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double valor1, valor2, valor3, mediaAritmetica, mediaPonderada;

        // Ler valores
        System.out.print("Insira o 1º valor: ");
        valor1 = input.nextDouble();

        System.out.print("Insira o 2º valor: ");
        valor2 = input.nextDouble();

        System.out.print("Insira o 3º valor: ");
        valor3 = input.nextDouble();

        // Calcular e apresentar a média aritmética
        mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        System.out.println("Média Aritmética: " + mediaAritmetica);

        // Calcular e apresentar a média ponderada
        mediaPonderada = (valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5);
        System.out.println("Média Ponderada: " + mediaPonderada);
    }
}
