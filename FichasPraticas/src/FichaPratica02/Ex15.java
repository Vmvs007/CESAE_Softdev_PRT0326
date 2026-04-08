package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int a, b, c;
        String opcao;

        // Ler numeros
        System.out.print("Insira o 1º valor: ");
        a = input.nextInt();

        System.out.print("Insira o 2º valor: ");
        b = input.nextInt();

        System.out.print("Insira o 3º valor: ");
        c = input.nextInt();

        System.out.print("\nCrescente (C) ou Decrescente (D): ");
        opcao = input.next().toUpperCase();

        switch (opcao) {

            case "C":
                if (a < b && a < c) {
                    // A ... ...
                    if (b < c) {
                        // A B C
                        System.out.println(a + " " + b + " " + c);
                    } else {
                        // A C B
                        System.out.println(a + " " + c + " " + b);
                    }
                }

                if (b < a && b < c) {
                    // B ... ...
                    if (a < c) {
                        // B A C
                        System.out.println(b + " " + a + " " + c);
                    } else {
                        // B C A
                        System.out.println(b + " " + c + " " + a);
                    }
                }

                if (c < a && c < b) {
                    // C ... ...
                    if (a < b) {
                        // C A B
                        System.out.println(c + " " + a + " " + b);
                    } else {
                        // C B A
                        System.out.println(c + " " + b + " " + a);
                    }
                }
                break;

            case "D":
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println(c + " " + b + " " + a);
                    } else {
                        System.out.println(b + " " + c + " " + a);
                    }
                }

                if (b < a && b < c) {
                    if (a < c) {
                        System.out.println(c + " " + a + " " + b);
                    } else {
                        System.out.println(a + " " + c + " " + b);
                    }
                }

                if (c < a && c < b) {
                    if (a < b) {
                        System.out.println(b + " " + a + " " + c);
                    } else {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
                break;

            default:
                System.out.println("Opção inválida: " + opcao);
                break;
        }
    }
}
