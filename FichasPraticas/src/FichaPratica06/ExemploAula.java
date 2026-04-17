package FichaPratica06;

import java.util.Scanner;

public class ExemploAula {

    public static int moduloDiferencaInteira(int a, int b) {
        int resultado;

        if (a > b) {
            resultado = a - b;
        } else {
            resultado = b - a;
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, res;

        System.out.print("Insira o número: ");
        num1 = input.nextInt();

        System.out.print("Insira o número: ");
        num2 = input.nextInt();


        res = moduloDiferencaInteira(num1,num2);
        System.out.println("Resultado: " + res);
    }
}
