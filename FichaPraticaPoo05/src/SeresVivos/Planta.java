package SeresVivos;

import Enums.FamiliaPlanta;

public class Planta extends SerVivo {
    private FamiliaPlanta familia;
    private int grauDefesa;

    public Planta(String nome, String especie, String pais, int idade, FamiliaPlanta familia, int grauDefesa) {
        super(nome, especie, pais, idade);

        if (grauDefesa < 0 || grauDefesa > 5) {
            throw new IllegalArgumentException("Grau de Defesa tem de ser entre 0 e 5");
        }

        this.familia = familia;
        this.grauDefesa = grauDefesa;
    }

    public FamiliaPlanta getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.especie + " | " + this.pais + " | " + this.familia + " | Grau Defesa: " + this.grauDefesa);
    }
}
