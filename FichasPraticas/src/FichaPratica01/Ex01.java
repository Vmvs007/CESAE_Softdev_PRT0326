package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int valor1, valor2, soma;

        System.out.println("___________ FP01 | EX01 ___________");

        // Perguntar valor 1 ao utilizador
        System.out.print("Insira um número: ");
        valor1 = input.nextInt();

        // Perguntar valor 2 ao utilizador
        System.out.print("Insira outro número: ");
        valor2 = input.nextInt();

        // Calcular a soma
        soma = valor1 + valor2;

        // Apresentar a soma
        System.out.println("Soma: " + soma);


    }
}
