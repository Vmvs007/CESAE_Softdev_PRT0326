package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int num, anterior, sucessor;

        // Ler numero
        System.out.print("Insira um número: ");
        num = input.nextInt();

        anterior = num - 5;
        sucessor = num + 5;

        while (anterior < num) {
            System.out.println(anterior);
            anterior++;
        }

        System.out.println();
        num++;

        while (num <= sucessor) {
            System.out.println(num);
            num++;
        }

    }
}
