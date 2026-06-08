package SeresVivos;

public class Inseto extends SerVivo {
    boolean venenoso;

    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    @Override
    public void exibirDetalhes() {
        if (this.venenoso) {
            System.out.println(this.nome + " | " + this.especie + " | " + this.pais + " | Venenoso");
        } else {
            System.out.println(this.nome + " | " + this.especie + " | " + this.pais + " | Inofensivo");
        }
    }
}
