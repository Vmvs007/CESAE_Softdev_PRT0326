package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int numero=1 , contador_00_25 = 0, contador_26_50 = 0, contador_51_75 = 0, contador_76_100 = 0;

        while (numero >= 0) {
            System.out.print("Insira um número: ");
            numero = input.nextInt();

            if (numero >= 0 && numero <= 25) {
                contador_00_25++;
            }

            if (numero >= 26 && numero <= 50) {
                contador_26_50++;
            }

            if (numero >= 51 && numero <= 75) {
                contador_51_75++;
            }

            if (numero >= 76 && numero <= 100) {
                contador_76_100++;
            }

        }

        System.out.println(" [00,25]: " + contador_00_25);
        System.out.println(" [26,50]: " + contador_26_50);
        System.out.println(" [51,75]: " + contador_51_75);
        System.out.println("[76,100]: " + contador_76_100);

    }
}
