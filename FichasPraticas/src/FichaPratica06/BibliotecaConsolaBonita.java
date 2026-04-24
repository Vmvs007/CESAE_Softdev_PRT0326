package FichaPratica06;

import java.util.Scanner;

public class BibliotecaConsolaBonita {

    /**
     * Função para limpar a consola, apenas avnça quando o utilizador prime enter
     */
    public static void primaEnterParaContinuar() {
        Scanner input = new Scanner(System.in);

        System.out.print("\n(Prima enter para continuar)");
        input.nextLine();

        for (int i = 0; i < 200; i++) {
            System.out.println();
        }
    }

    public static void copyright(){
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("____ Desenvolvido por: Vitor Santos ____");
        System.out.println("________________________________________");
        System.out.println("________________________________________");
    }
}
