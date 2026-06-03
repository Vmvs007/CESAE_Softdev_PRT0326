package Ex02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private String nome;
    private double premio;
    private ArrayList<Pessoa> participantes;

    public Sorteio(String nome, double premio) {
        this.nome = nome;
        this.premio = premio;
        this.participantes = new ArrayList<Pessoa>();
    }

    public String getNome() {
        return nome;
    }

    public double getPremio() {
        return premio;
    }

    public void inscreverPessoa(Pessoa pessoaNova) {

        if (pessoaNova.getIdade() >= 18) {
            this.participantes.add(pessoaNova);
            System.out.println("Inscrição Aceite: " + pessoaNova.getNome());
        } else {
            System.out.println("Inscrição Recusada: " + pessoaNova.getNome() + " é menor de idade!");
        }

    }

    public Pessoa sortear() {

        Random rd = new Random();

        int indexSorteado = rd.nextInt(this.participantes.size());

        Pessoa vencedor = this.participantes.get(indexSorteado);

        return vencedor;
    }
}
