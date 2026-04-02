package FichaPratica02;

import java.util.Scanner;

public class Ex10_v2 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler números
        System.out.print("Insira um número: ");
        num1 = input.nextDouble();

        System.out.print("Insira outro número: ");
        num2 = input.nextDouble();

        System.out.print("Operação aritmética ( + - * / ): ");
        operacao = input.next();

        if (operacao.equals("+")) {
            resultado = num1 + num2;
            System.out.println("Soma: " + resultado);
        }

        if (operacao.equals("-")) {
            resultado = num1 - num2;
            System.out.println("Subtração: " + resultado);
        }

        if (operacao.equals("*")) {
            resultado = num1 * num2;
            System.out.println("Multiplicação: " + resultado);
        }

        if (operacao.equals("/")) {
            resultado = num1 / num2;
            System.out.println("Divisão: " + resultado);
        }

        if (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")) {
            System.out.println("Operação não reconhecida: " + operacao);
        }


    }
}
