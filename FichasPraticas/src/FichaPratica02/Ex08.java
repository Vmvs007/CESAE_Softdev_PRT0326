package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double nota1, nota2, nota3, mediaPonderada;

        // Ler valores
        System.out.print("Insira o 1º valor: ");
        nota1 = input.nextDouble();

        System.out.print("Insira o 2º valor: ");
        nota2 = input.nextDouble();

        System.out.print("Insira o 3º valor: ");
        nota3 = input.nextDouble();

        // Calcular a media ponderada
        mediaPonderada = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);

        // System.out.println("Média Ponderada: "+mediaPonderada);

        if (mediaPonderada >= 9.5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }


    }
}
