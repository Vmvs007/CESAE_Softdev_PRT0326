package FichaPratica03;

import java.util.Scanner;

public class Ex08_v2 {
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

        while (anterior <= sucessor) {

            if (anterior != num) {
                System.out.println(anterior);
            }

            anterior++;
        }

    }
}
