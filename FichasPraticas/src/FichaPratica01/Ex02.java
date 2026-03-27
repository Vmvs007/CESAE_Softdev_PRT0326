package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int valor1, valor2, resultado;

        // Ler valor 1
        System.out.print("Insira 1º número: ");
        valor1 = input.nextInt();

        // Ler valor 2
        System.out.print("Insira 2º número: ");
        valor2 = input.nextInt();

        // Calcular e apresentar a soma
        resultado = valor1 + valor2;
        System.out.println("A soma é: " + resultado);

        // Calcular e apresentar a subtracao
        resultado = valor1 - valor2;
        System.out.println("A subtração é: " + resultado);

        // Calcular e apresentar a multiplicacao
        resultado = valor1 * valor2;
        System.out.println("A multiplicação é: " + resultado);

        // Calcular e apresentar a divisao
        resultado = valor1 / valor2;
        System.out.println("A divisão é: " + resultado);

    }
}
