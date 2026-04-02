package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int valor1, valor2;

        // Leitura das variáveis
        System.out.print("Insira um número: ");
        valor1 = input.nextInt();

        System.out.print("Insira outro número: ");
        valor2 = input.nextInt();

        if (valor1 < valor2) {
            System.out.println(valor2 + " " + valor1);
        }else{
            System.out.println(valor1 + " " + valor2);
        }
    }
}
