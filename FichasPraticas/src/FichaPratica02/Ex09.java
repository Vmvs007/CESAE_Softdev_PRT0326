package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int num1, num2, num3;

        // Ler numeros
        System.out.print("Insira o 1º número: ");
        num1 = input.nextInt();

        System.out.print("Insira o 2º número: ");
        num2 = input.nextInt();

        System.out.print("Insira o 3º número: ");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Menor: " + num1);
        }

        if (num2 < num1 && num2 < num3) {
            System.out.println("Menor: " + num2);
        }

        if (num3 < num1 && num3 < num2) {
            System.out.println("Menor: " + num3);
        }

    }
}
