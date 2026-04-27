package FichaPratica07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demonstracao {

    public static int lerInteiro() {

        Scanner input = new Scanner(System.in);
        boolean numeroIntroduzido = false;
        int num = 0;

        do {

            try {
                System.out.print("Insira um número: ");
                num = input.nextInt();

                numeroIntroduzido = true;

            } catch (InputMismatchException exc) {
                System.out.println("Por favor, introduza um número!");
            }
            input.nextLine();
        } while (numeroIntroduzido == false);

        return num;
    }

    public static void main(String[] args) {

        int numero = lerInteiro();

        System.out.println(numero);

    }
}