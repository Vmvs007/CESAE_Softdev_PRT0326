package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int limite, contadorVezes = 0;
        String mensagem;

        // Ler valores
        System.out.print("Quantas vezes quer imprimir a mensagem: ");
        limite = input.nextInt();

        System.out.print("Mensagem: ");
        input.nextLine();
        mensagem = input.nextLine();

        while (contadorVezes < limite) {
            System.out.println(mensagem);
            contadorVezes = contadorVezes + 1;
        }
    }
}
