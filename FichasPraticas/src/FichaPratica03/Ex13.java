package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int limite, numero;

        // Ler valores
        System.out.print("Insira o inicio: ");
        numero = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (numero <= limite) {

            if (numero % 5 == 0) {
                System.out.println(numero);
            }

            numero++;
        }
    }
}
