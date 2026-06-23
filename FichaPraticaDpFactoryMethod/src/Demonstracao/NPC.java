package Demonstracao;

public class NPC {
    private String nome;
    private int vida;
    private int forca;

    public NPC(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | Vida: " + this.vida + " | Força: " + forca);
    }
}
