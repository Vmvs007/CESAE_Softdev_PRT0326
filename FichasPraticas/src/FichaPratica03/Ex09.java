package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double num = 0, somatorio = 1, contador = -1, media;

        while (num != -1) {
            System.out.print("Insira um número (-1 para parar): ");
            num = input.nextDouble();

            somatorio = somatorio + num;
            contador++;
        }

        media = somatorio / contador;

        System.out.println("Média: " + media);

    }
}
