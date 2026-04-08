package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int limite, numero, salto = 1;

        // Ler valores
        System.out.print("Insira o inicio: ");
        numero = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + salto;
        }
    }
}
