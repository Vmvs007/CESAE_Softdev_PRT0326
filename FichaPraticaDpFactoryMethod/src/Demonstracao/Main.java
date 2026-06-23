package Demonstracao;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Heroi jogador = new Heroi("Joaquim","Portugal",100,20);

        // Dificuldade: fácil
        jogador.atacar(NpcFactory.inimigoFacil());

        System.out.println("\n______________________________________\n");

        // Dificuldade: média
        jogador.atacar(NpcFactory.inimigoMedio());

        System.out.println("\n______________________________________\n");

        // Dificuldade: dificil
        jogador.atacar(NpcFactory.inimigoDificil());

    }
}
