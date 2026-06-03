package Random;

import java.util.Random;

public class DemonstracaoRandom {
    public static void main(String[] args) {

        Random rd = new Random();

        // Primeiro caso - rd.nextInt() - Qualquer aleatório

        // Segundo caso - rd.nextInt(30) - Numero aleatório entre 0 e 29 (30 exclusive)

        // Segundo caso - rd.nextInt(55,100) - Numero aleatório entre 55 (inclusive) e 99 (100 exclusive)
        int numAleatorio = rd.nextInt(55, 100);

        System.out.println(numAleatorio);
    }
}
