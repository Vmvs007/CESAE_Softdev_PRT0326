package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
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

        switch (operacao) {

            case "+":
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;

            case "-":
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;

            case "*":
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;

            case "/":
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
                break;

            default:
                System.out.println("Operação não reconhecida: " + operacao);
                break;
        }
    }
}
