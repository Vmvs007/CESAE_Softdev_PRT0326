package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int largura, altura, perimetro, area;

        // Ler largura
        System.out.print("Insira a largura (m.): ");
        largura = input.nextInt();

        // Ler altura
        System.out.print("Insira a altura (m.): ");
        altura = input.nextInt();

        // Calcular e apresentar o perimetro
        perimetro = altura + altura + largura + largura;
        System.out.println("Perímetro: " + perimetro + " m.");

        // Calcular e apresentar a area
        area = largura * altura;
        System.out.println("Área: " + area + " m2.");
    }
}
