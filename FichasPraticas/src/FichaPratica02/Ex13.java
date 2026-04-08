package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int horas, minutos;

        // Leitura
        System.out.print("Horas: ");
        horas = input.nextInt();

        System.out.print("Minutos: ");
        minutos = input.nextInt();

        if (horas <= 12) {
            // Manhã
            System.out.println(horas + ":" + minutos + " AM");
        } else {
            // Tarde
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + " PM");
        }
    }
}
