package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double produto1, produto2, produto3, precoTotal, precoComDesconto;

        // Ler preços
        System.out.print("Insira o preço do 1º produto: ");
        produto1 = input.nextDouble();

        System.out.print("Insira o preço do 2º produto: ");
        produto2 = input.nextDouble();

        System.out.print("Insira o preço do 3º produto: ");
        produto3 = input.nextDouble();

        // Calcular o total
        precoTotal = produto1 + produto2 + produto3;

        // Aplicar o desconto
        precoComDesconto = precoTotal *0.9;

        // Apresentar o total com desconto
        System.out.println("Preço c/ 10% de desconto: "+precoComDesconto);
    }
}
