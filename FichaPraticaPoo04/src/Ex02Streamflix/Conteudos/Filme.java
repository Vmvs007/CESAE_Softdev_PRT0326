package Ex02Streamflix.Conteudos;

import Ex02Streamflix.Enums.Genero;

public class Filme extends Entretenimento {
    private String realizador;
    private boolean oscarizado;

    public Filme(String titulo, int duracaoMinutos, int anoLancamento, int classificacaoEtaria, int avaliacao, Genero genero, String realizador, boolean oscarizado) {
        super(titulo, duracaoMinutos, anoLancamento, classificacaoEtaria, avaliacao, genero);
        this.realizador = realizador;
        this.oscarizado = oscarizado;
    }


    @Override
    public void reproduzir() {
        System.out.println("A reproduzir filme: " + this.titulo);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println(this.genero + " | Realizador: " + this.realizador);
    }
}
