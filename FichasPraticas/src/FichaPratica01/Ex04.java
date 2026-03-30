package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double raio, area, pi = 3.1415926;

        // Ler raio
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        // Calcular e apresentar a área
        area = pi * raio * raio;
        System.out.println("Área: " + area);
    }
}
