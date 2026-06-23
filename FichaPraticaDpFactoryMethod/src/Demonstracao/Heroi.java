package Demonstracao;

import static java.lang.Thread.sleep;

public class Heroi {
    private String nome;
    private String nacionalidade;
    private int vida;
    private int forca;

    public Heroi(String nome, String nacionalidade, int vida, int forca) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(NPC inimigo) throws InterruptedException {

        System.out.println("Uma batalha vai começar entre " + this.vida + " e " + inimigo.getNome());
        this.exibirDetalhes();
        inimigo.exibirDetalhes();

        sleep(2000);
        System.out.println("Murro");
        sleep(2000);
        System.out.println("Pontapé");
        sleep(2000);

        System.out.println("Venceu o " + this.nome);
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.nacionalidade + " | Vida: " + this.vida + " | Força: " + forca);
    }
}
