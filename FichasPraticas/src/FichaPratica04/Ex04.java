package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int numero;
        boolean primo = true;

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não primo...");
        }

    }
}
