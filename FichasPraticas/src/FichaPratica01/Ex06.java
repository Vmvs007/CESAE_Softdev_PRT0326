package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int valor1, valor2, aux;

        // Ler valores
        System.out.print("Insira o valor 1: ");
        valor1 = input.nextInt();

        System.out.print("Insira o valor 2: ");
        valor2 = input.nextInt();

        // Trocar os valores
        aux = valor1;

        valor1 = valor2;
        valor2 = aux;


        // Apresentamos os valores trocados
        System.out.println("\nValor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

    }
}
