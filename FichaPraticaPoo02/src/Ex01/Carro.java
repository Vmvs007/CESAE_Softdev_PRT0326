package Ex01;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabrico;
    private int potenciaCv;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoL100Km;

    public Carro(String marca, String modelo, String cor, int anoFabrico, int potenciaCv, int cc, TipoCombustivel combustivel, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.potenciaCv = potenciaCv;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoL100Km = consumoL100Km;
    }

    public int idade() {
        return 2026 - this.anoFabrico;
    }

    public void ligar() {

        if (this.idade() > 30) { // Carro antigo

            if (this.combustivel.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        } else { // Carro recente

            if (this.potenciaCv < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMMMMM");
            }
        }

    }

    public Carro corrida(Carro adversario) {

        if (this.potenciaCv > adversario.potenciaCv) {
            // Meu carro ganha a corrida
            return this;
        } else if (this.potenciaCv < adversario.potenciaCv) {
            // Ganha adversario
            return adversario;
        } else {
            // Empate potência

            if (this.cc > adversario.cc) {
                // Meu carro ganha a corrida
                return this;
            } else if (this.cc < adversario.cc) {
                // Ganha adversario
                return adversario;
            } else {
                // Empate cc

                if (this.idade() < adversario.idade()) {
                    // Meu carro ganha a corrida
                    return this;
                } else if (this.idade() > adversario.idade()) {
                    // Ganha adversario
                    return adversario;
                } else {
                    // Empate
                    return null;
                }
            }

        }
    }

    public void exibirDetalhes() {
        System.out.println(this.marca + " " + this.modelo + " " + this.cor + " " + this.anoFabrico);
    }
}
