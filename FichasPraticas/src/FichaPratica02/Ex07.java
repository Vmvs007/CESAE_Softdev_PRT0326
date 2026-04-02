package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int numero;

        // Ler numero
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
