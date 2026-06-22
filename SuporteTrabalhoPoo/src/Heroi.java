public class Heroi {

    private static Heroi instance;

    private String nome;
    private int nivel;
    private int vida;
    private int forca;

    private Heroi(String nome, int nivel, int vida, int forca) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.forca = forca;
    }

    public static Heroi getInstance(String nome, int nivel, int vida, int forca) {
        if (instance == null) {
            instance = new Heroi(nome, nivel, vida, forca);
        }

        return instance;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }
}
